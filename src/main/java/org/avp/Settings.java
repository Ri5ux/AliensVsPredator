package org.avp;

import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import com.asx.mdx.MDX;
import com.asx.mdx.config.ConfigSetting;
import com.asx.mdx.config.ConfigSettingBiomeList;
import com.asx.mdx.config.ConfigSettingBoolean;
import com.asx.mdx.config.ConfigSettingGraphics;
import com.asx.mdx.config.ConfigSettingInteger;
import com.asx.mdx.config.GraphicsSetting;
import com.asx.mdx.config.IFlexibleConfiguration;
import com.asx.mdx.core.mods.IPreInitEvent;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Settings implements IPreInitEvent, IFlexibleConfiguration
{
    public static final Settings           instance          = new Settings();

    private Configuration                  configuration;
    private final ArrayList<ConfigSetting> allSettings       = new ArrayList<ConfigSetting>();

    private final String                   CATEGORY_OTHER    = "general";
    private final String                   CATEGORY_BIOMES   = "biomes";
    private final String                   CATEGORY_SPAWNING = "spawning";

    private ConfigSetting                  experimentalFeatures;
    private ConfigSetting                  explosionsEnabled;
    private ConfigSetting                  plasmaCannonExplosions;
    private ConfigSetting                  updaterEnabled;
    private ConfigSetting                  debugToolsEnabled;
    private ConfigSetting                  nukesEnabled;
    private ConfigSetting                  overworldSpawnsEnabled;
    private ConfigSetting                  autoSpawnsEnabled;
    private ConfigSetting                  evolvedXenomorphSpawns;
    private ConfigSetting                  biomeVarda;
    private ConfigSetting                  biomeVardaForest;
    private ConfigSetting                  biomeAcheron;
    private ConfigSetting                  globalSoundVolume;

    private ConfigSetting                  spawnsAlien;
    private ConfigSetting                  spawnsAquaticAlien;
    private ConfigSetting                  spawnsPredator;
    private ConfigSetting                  spawnsMarine;
    private ConfigSetting                  spawnsVarda;

    public ConfigSetting                  spawnWeightEntityNauticomorph;
    public ConfigSetting                  spawnWeightEntityDrone;
    public ConfigSetting                  spawnWeightEntityWarrior;
    public ConfigSetting                  spawnWeightEntityPraetorian;
    public ConfigSetting                  spawnWeightEntityChestburster;
    public ConfigSetting                  spawnWeightEntityFacehugger;
    public ConfigSetting                  spawnWeightEntityYautjaWarrior;
    public ConfigSetting                  spawnWeightEntityYautjaBerserker;
    public ConfigSetting                  spawnWeightEntityMarine;
    public ConfigSetting                  spawnWeightEntityEngineer;
    public ConfigSetting                  spawnWeightEntitySpaceJockey;
    public ConfigSetting                  spawnWeightEntityHammerpede;
    public ConfigSetting                  spawnWeightEntityOctohugger;
    public ConfigSetting                  spawnWeightEntityDeacon;
    public ConfigSetting                  spawnWeightEntityTrilobite;


    @Override
    public ArrayList<ConfigSetting> allSettings()
    {
        return this.allSettings;
    }

    @Override
    public void saveSettings()
    {
        this.configuration.save();
    }

    @SideOnly(Side.CLIENT)
    public static class ClientSettings implements IFlexibleConfiguration
    {
        public static final ClientSettings     instance          = new ClientSettings();
        private Configuration                  configuration;
        private final ArrayList<ConfigSetting> allSettings       = new ArrayList<ConfigSetting>();

        private final String                   CATEGORY_GRAPHICS = "graphics";

        private ConfigSettingGraphics          hiveTessellation;
        private ConfigSettingGraphics          bloodDetails;
        private ConfigSettingBoolean           bloodEffects;

        public void load(Configuration configuration)
        {
            this.configuration = configuration;
            this.hiveTessellation = new ConfigSettingGraphics(this, configuration.get(CATEGORY_GRAPHICS, "hive_tessellation", GraphicsSetting.ULTRA.ordinal(), "The visual complexity and detail of xenomorph hives."));
            this.bloodDetails = new ConfigSettingGraphics(this, configuration.get(CATEGORY_GRAPHICS, "blood_details", GraphicsSetting.ULTRA.ordinal(), "Sets the amount of blood particles and how long they last."));
            this.bloodEffects = new ConfigSettingBoolean(this, configuration.get(CATEGORY_GRAPHICS, "blood_fx", true, "Turns blood particle effects on or off."));
        }

        public void saveSettings()
        {
            this.configuration.save();
        }

        public ConfigSettingGraphics hiveTessellation()
        {
            return this.hiveTessellation;
        }

        public ConfigSettingGraphics bloodDetails()
        {
            return this.bloodDetails;
        }

        public ConfigSettingBoolean bloodFX()
        {
            return bloodEffects;
        }

        @Override
        public ArrayList<ConfigSetting> allSettings()
        {
            return this.allSettings;
        }
    }

    @EventHandler
    public void pre(FMLPreInitializationEvent evt)
    {
        configuration = new Configuration(new File(evt.getModConfigurationDirectory(), "aliensvspredator.config"));
        try
        {
            configuration.load();

            if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
            {
                ClientSettings.instance.load(configuration);
            }

            biomeVarda = new ConfigSettingInteger(this, configuration.get(CATEGORY_BIOMES, "varda_badlands", 223, "Change the internal ID of this biome. WARNING: Changing a biome ID will prevent existing worlds from loading.")).setRequiresRestart();
            biomeAcheron = new ConfigSettingInteger(this, configuration.get(CATEGORY_BIOMES, "acheron", 224, "Change the internal ID of this biome. WARNING: Changing a biome ID will prevent existing worlds from loading.")).setRequiresRestart();
            biomeVardaForest = new ConfigSettingInteger(this, configuration.get(CATEGORY_BIOMES, "varda_forest", 229, "Change the internal ID of this biome. WARNING: Changing a biome ID will prevent existing worlds from loading.")).setRequiresRestart();

            experimentalFeatures = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "experimental_features", false, "If enabled, experimental mod features will be turned on. If using this on a server, it will need to be enabled on both the client and server to work properly."));
            plasmaCannonExplosions = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "plasma_cannon_explosions", false, "If enabled, a plasma cannon's projectiles will explode upon impact."));
            explosionsEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "explosion_block_damage", true, "If disabled, all explosions triggered by this mod will be cancelled."));
            nukesEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "nukes", true, "If disabled, you will not be allowed to use any nuke-based functionality."));
            updaterEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "updater", true, "Toggle the mod's update checking capabilities. Will not check for new updates if disabled.")).setRequiresRestart();
            debugToolsEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_OTHER, "debug_tools", false, "Toggle the built in debugging tools. Used primarily in development environments."));
            globalSoundVolume = new ConfigSettingInteger(this, configuration.get(CATEGORY_OTHER, "global_volume", 75, "Change the default volume of this mod's sounds. EXAMPLE: 100 = 100% Volume, 50 = 50% Volume, 150 = 150% Volume")).setRequiresRestart();

            spawnWeightEntityNauticomorph = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityNauticomorph", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityDrone = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityDrone", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityWarrior = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityWarrior", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityPraetorian = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityPraetorian", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityChestburster = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityChestburster", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityFacehugger = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityFacehugger", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityYautjaWarrior = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityYautjaWarrior", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityYautjaBerserker = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityYautjaBerserker", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityMarine = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityMarine", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityEngineer = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityEngineer", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntitySpaceJockey = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntitySpaceJockey", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityHammerpede = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityHammerpede", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityOctohugger = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityOctohugger", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityDeacon = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityDeacon", 5, "Spawn Weight")).setRequiresRestart();
            spawnWeightEntityTrilobite = new ConfigSettingInteger(this, configuration.get(CATEGORY_SPAWNING, "EntityTrilobite", 5, "Spawn Weight")).setRequiresRestart();

            overworldSpawnsEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_SPAWNING, "overworld_spawning", true, "If disabled, no mobs from this mod will spawn in the overworld.")).setRequiresRestart();
            autoSpawnsEnabled = new ConfigSettingBoolean(this, configuration.get(CATEGORY_SPAWNING, "auto_spawning", true, "If disabled, no mobs from this mod will spawn.")).setRequiresRestart();
            evolvedXenomorphSpawns = new ConfigSettingBoolean(this, configuration.get(CATEGORY_SPAWNING, "mature_spawns", true, "If disabled, no mature alien states will spawn naturally.")).setRequiresRestart();

            if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
            {
                System.out.println("Listing Overworld Biome IDs for configuration settings...");
                for (Biome b : EntityHandler.getOverworldBiomeList())
                {
                    MDX.log().info(b.getBiomeName() + " : " + b.getRegistryName());
                }
            }

            spawnsAlien = new ConfigSettingBiomeList(this, configuration.get(CATEGORY_SPAWNING, "alien_biomes", ConfigSettingBiomeList.biomeIdListForConfig(EntityHandler.DEFAULT_ALIEN_SPAWNS), "List of biomes for aliens to spawn in.")).setRequiresRestart();
            spawnsAquaticAlien = new ConfigSettingBiomeList(this, configuration.get(CATEGORY_SPAWNING, "aquatic_alien_biomes", ConfigSettingBiomeList.biomeIdListForConfig(EntityHandler.DEFAULT_AQUA_ALIEN_SPAWNS), "List of biomes for aquatic aliens to spawn in.")).setRequiresRestart();
            spawnsPredator = new ConfigSettingBiomeList(this, configuration.get(CATEGORY_SPAWNING, "predator_biomes", ConfigSettingBiomeList.biomeIdListForConfig(EntityHandler.DEFAULT_PREDATOR_SPAWNS), "List of biomes for predators to spawn in.")).setRequiresRestart();
            spawnsMarine = new ConfigSettingBiomeList(this, configuration.get(CATEGORY_SPAWNING, "marine_biomes", ConfigSettingBiomeList.biomeIdListForConfig(EntityHandler.DEFAULT_MARINE_SPAWNS), "List of biomes for marines to spawn in.")).setRequiresRestart();
            spawnsVarda = new ConfigSettingBiomeList(this, configuration.get(CATEGORY_SPAWNING, "varda_biomes", ConfigSettingBiomeList.biomeIdListForConfig(EntityHandler.DEFAULT_VARDA_LIFE_SPAWNS), "List of biomes for varda wildlife to spawn in.")).setRequiresRestart();
        }
        finally
        {
            configuration.save();
        }
    }

    public Configuration getConfig()
    {
        return configuration;
    }

    public boolean areOverworldSpawnsEnabled()
    {
        return (Boolean) overworldSpawnsEnabled.value();
    }

    public boolean areAutoSpawnsEnabled()
    {
        return (Boolean) autoSpawnsEnabled.value();
    }

    public boolean arePlasmaCannonExplosionsEnabled()
    {
        return (Boolean) plasmaCannonExplosions.value();
    }

    public boolean shouldEvolvedXenomorphsSpawn()
    {
        return (Boolean) evolvedXenomorphSpawns.value();
    }

    public boolean areExplosionsEnabled()
    {
        return (Boolean) this.explosionsEnabled.value();
    }

    public boolean isUpdaterEnabled()
    {
        return (Boolean) this.updaterEnabled.value();
    }

    public boolean areDebugToolsEnabled()
    {
        return (Boolean) this.debugToolsEnabled.value();
    }

    public boolean areExperimentalFeaturesEnabled()
    {
        return (Boolean) this.experimentalFeatures.value();
    }

    public boolean areNukesEnabled()
    {
        return (Boolean) this.nukesEnabled.value();
    }

    public int biomeIdVardaBadlands()
    {
        return (Integer) this.biomeVarda.value();
    }

    public int biomeIdVardaForest()
    {
        return (Integer) this.biomeVardaForest.value();
    }

    public int biomeIdAcheron()
    {
        return (Integer) this.biomeAcheron.value();
    }

    public float globalSoundVolume()
    {
        return (float) ((Integer) this.globalSoundVolume.value()) / 100F;
    }

    public boolean isHalloweenEventEnabled()
    {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return (localDate.getMonthValue() == 10 && localDate.getDayOfMonth() >= 27 || localDate.getMonthValue() == 11 && localDate.getDayOfMonth() <= 3);
    }

    public ConfigSettingBiomeList getSpawnsAlien()
    {
        return (ConfigSettingBiomeList) spawnsAlien;
    }

    public ConfigSettingBiomeList getSpawnsAquaticAlien()
    {
        return (ConfigSettingBiomeList) spawnsAquaticAlien;
    }

    public ConfigSettingBiomeList getSpawnsMarine()
    {
        return (ConfigSettingBiomeList) spawnsMarine;
    }

    public ConfigSettingBiomeList getSpawnsPredator()
    {
        return (ConfigSettingBiomeList) spawnsPredator;
    }

    public ConfigSettingBiomeList getSpawnsVarda()
    {
        return (ConfigSettingBiomeList) spawnsVarda;
    }
}
