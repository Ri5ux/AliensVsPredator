package org.avp.client;

import org.avp.AliensVsPredator;
import org.avp.client.model.entities.ModelBullet;
import org.avp.client.model.entities.ModelLaserMine;
import org.avp.client.model.entities.ModelSpear;
import org.avp.client.model.entities.ModelSporePod;
import org.avp.client.model.entities.ModelSupplyChute;
import org.avp.client.model.entities.living.ModelAethon;
import org.avp.client.model.entities.living.ModelAqua;
import org.avp.client.model.entities.living.ModelBabyhead;
import org.avp.client.model.entities.living.ModelBatXenomorph;
import org.avp.client.model.entities.living.ModelBelugaburster;
import org.avp.client.model.entities.living.ModelBelugamorph;
import org.avp.client.model.entities.living.ModelBoiler;
import org.avp.client.model.entities.living.ModelChestburster;
import org.avp.client.model.entities.living.ModelChestbursterPredalien;
import org.avp.client.model.entities.living.ModelChestbursterQueen;
import org.avp.client.model.entities.living.ModelChestbursterRunner;
import org.avp.client.model.entities.living.ModelCrusher;
import org.avp.client.model.entities.living.ModelDeacon;
import org.avp.client.model.entities.living.ModelDeaconAdult;
import org.avp.client.model.entities.living.ModelDeaconShark;
import org.avp.client.model.entities.living.ModelDracoOvamorph;
import org.avp.client.model.entities.living.ModelDracoburster;
import org.avp.client.model.entities.living.ModelDracomorph;
import org.avp.client.model.entities.living.ModelDrone;
import org.avp.client.model.entities.living.ModelEngineer;
import org.avp.client.model.entities.living.ModelFacehugger;
import org.avp.client.model.entities.living.ModelGooMutant;
import org.avp.client.model.entities.living.ModelHammerpede;
import org.avp.client.model.entities.living.ModelMarine;
import org.avp.client.model.entities.living.ModelMatriarch;
import org.avp.client.model.entities.living.ModelMutantYautja;
import org.avp.client.model.entities.living.ModelMyceliomorph;
import org.avp.client.model.entities.living.ModelOctohugger;
import org.avp.client.model.entities.living.ModelOvamorph;
import org.avp.client.model.entities.living.ModelPantheramorph;
import org.avp.client.model.entities.living.ModelPraetorian;
import org.avp.client.model.entities.living.ModelPredalien;
import org.avp.client.model.entities.living.ModelPredatorHound;
import org.avp.client.model.entities.living.ModelRoyalFacehugger;
import org.avp.client.model.entities.living.ModelRunnerDrone;
import org.avp.client.model.entities.living.ModelRunnerWarrior;
import org.avp.client.model.entities.living.ModelSpitter;
import org.avp.client.model.entities.living.ModelTrilobite;
import org.avp.client.model.entities.living.ModelUltramorph;
import org.avp.client.model.entities.living.ModelUrsuidae;
import org.avp.client.model.entities.living.ModelVardaMonkey;
import org.avp.client.model.entities.living.ModelWarrior;
import org.avp.client.model.entities.living.ModelYautja;
import org.avp.client.model.items.Model88MOD4;
import org.avp.client.model.items.ModelAK47;
import org.avp.client.model.items.ModelM240ICU;
import org.avp.client.model.items.ModelM4;
import org.avp.client.model.items.ModelM40;
import org.avp.client.model.items.ModelM41A;
import org.avp.client.model.items.ModelM56SG;
import org.avp.client.model.items.ModelMotionTracker;
import org.avp.client.model.items.ModelPlasmaCannon;
import org.avp.client.model.items.ModelSevastopolFlamethrower;
import org.avp.client.model.items.ModelSniper;
import org.avp.client.model.items.ModelStunBaton;
import org.avp.client.model.items.ModelWristBlade;
import org.avp.client.model.tile.ModelAmpule;
import org.avp.client.model.tile.ModelBlastdoor;
import org.avp.client.model.tile.ModelCCFL;
import org.avp.client.model.tile.ModelCable;
import org.avp.client.model.tile.ModelCryostasisTube;
import org.avp.client.model.tile.ModelDNASynthesizer;
import org.avp.client.model.tile.ModelHiveResin;
import org.avp.client.model.tile.ModelLightPanel;
import org.avp.client.model.tile.ModelLocker;
import org.avp.client.model.tile.ModelMedpod;
import org.avp.client.model.tile.ModelPowercell;
import org.avp.client.model.tile.ModelRedstoneFluxGenerator;
import org.avp.client.model.tile.ModelRepulsionGenerator;
import org.avp.client.model.tile.ModelSatelliteDish;
import org.avp.client.model.tile.ModelSevastopolBlastdoor;
import org.avp.client.model.tile.ModelSolarPanel;
import org.avp.client.model.tile.ModelStasisMechanism;
import org.avp.client.model.tile.ModelTransformer;
import org.avp.client.model.tile.ModelTurret;
import org.avp.client.model.tile.ModelWorkstation;
import org.avp.client.model.tile.plants.ModelGroundFern;
import org.avp.client.model.tile.plants.ModelTreeFern;
import org.avp.client.model.tile.rackmodules.ModelNetworkModuleRack;
import org.avp.client.model.tile.rackmodules.ModelRackModule1;
import org.avp.client.model.tile.rackmodules.ModelRackModule2;
import org.avp.client.model.tile.rackmodules.ModelRackModule3;
import org.avp.client.model.tile.rackmodules.ModelRackModule4;
import org.avp.client.model.tile.rackmodules.ModelRackModule5;
import org.avp.client.model.tile.rackmodules.ModelRackModule6;
import org.avp.client.model.tile.rackmodules.ModelRackModule7;
import org.avp.client.model.tile.rackmodules.ModelRackModule8;

import com.arisux.mdx.lib.client.render.Texture;
import com.arisux.mdx.lib.client.render.model.MapModelTexture;
import com.arisux.mdx.lib.client.render.model.Model;
import com.arisux.mdx.lib.client.render.model.SpecialModelBiped;
import com.arisux.mdx.lib.client.render.model.WavefrontModelLoader;
import com.arisux.mdx.lib.client.render.wavefront.TriangulatedWavefrontModel;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Resources
{
    public static final Resources instance = new Resources();
    private static final Models   models   = new Models();

    public Models models()
    {
        return models;
    }

    @SideOnly(Side.CLIENT)
    @SuppressWarnings("all")
    public static class Models
    {
        public final MapModelTexture<ModelAethon>                 AETHON                         = new MapModelTexture(new ModelAethon(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/aethon.png"));
        public final MapModelTexture<ModelRunnerDrone>            RUNNER_DRONE                   = new MapModelTexture(new ModelRunnerDrone(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/runner_drone.png"));
        public final MapModelTexture<ModelRunnerWarrior>          RUNNER_WARRIOR                 = new MapModelTexture(new ModelRunnerWarrior(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/runner_warrior.png"));
        public final MapModelTexture<Model88MOD4>                 _88MOD4                        = new MapModelTexture(new Model88MOD4(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/88mod4.png"));
        public final MapModelTexture<ModelSevastopolFlamethrower> SEVASTOPOL_FLAMETHROWER        = new MapModelTexture(new ModelSevastopolFlamethrower(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/flamethrower.sevastopol.png"));
        public final MapModelTexture<ModelEngineer>               ENGINEER                       = new MapModelTexture(new ModelEngineer(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/engineer_bio.png"));
        public final MapModelTexture<ModelLocker>                 LOCKER                         = new MapModelTexture(new ModelLocker(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/locker.png"));
        public final MapModelTexture<ModelLocker>                 GUN_LOCKER                     = new MapModelTexture(new ModelLocker(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/gunlocker.png"));
        public final MapModelTexture<ModelEngineer>               SPACE_JOCKEY                   = new MapModelTexture(new ModelEngineer(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/engineer.png"));
        public final MapModelTexture<ModelAmpule>                 AMPULE                         = new MapModelTexture(new ModelAmpule(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/ampule.png"));
        public final MapModelTexture<ModelTransformer>            TRANSFORMER                    = new MapModelTexture(new ModelTransformer(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/transformer.png"));
        public final MapModelTexture<ModelSolarPanel>             SOLAR_PANEL                    = new MapModelTexture(new ModelSolarPanel(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/solarpanel.png"));
        public final MapModelTexture<ModelSatelliteDish>          SATELLITE_DISH                 = new MapModelTexture(new ModelSatelliteDish(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/satellite-dish.png"));
        public final MapModelTexture<ModelPowercell>              POWERCELL                      = new MapModelTexture(new ModelPowercell(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/powercell.png"));
        public final MapModelTexture<ModelPowercell>              POWERCELL_LIQUID               = new MapModelTexture(new ModelPowercell(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/powercellliquid.png"));
        public final MapModelTexture<ModelDrone>                  DRONE_BASIC                    = new MapModelTexture(new ModelDrone(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/drone_basic.png"));
        public final MapModelTexture<ModelDrone>                  DRONE_ADVANCED                 = new MapModelTexture(new ModelDrone(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/drone_advanced.png"));
        public final MapModelTexture<ModelBullet>                 BULLET                         = new MapModelTexture(new ModelBullet(), new Texture(AliensVsPredator.Properties.ID, "textures/misc/renderbullet.png"));
        public final MapModelTexture<ModelSpear>                  SPEAR                          = new MapModelTexture(new ModelSpear(), new Texture(AliensVsPredator.Properties.ID, "textures/misc/renderspear.png"));
        public final MapModelTexture<ModelWristBlade>             WRISTBLADES                    = new MapModelTexture(new ModelWristBlade(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/wristblade.png"));
        public final MapModelTexture<ModelStunBaton>              STUNBATON                      = new MapModelTexture(new ModelStunBaton(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/stunbaton.png"));
        public final MapModelTexture<ModelPlasmaCannon>           PLASMACANNON                   = new MapModelTexture(new ModelPlasmaCannon(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/plasmacannon.png"));
        public final MapModelTexture<ModelM240ICU>                M240ICU                        = new MapModelTexture(new ModelM240ICU(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/m240icu.png"));
        public final MapModelTexture<ModelM41A>                   M41A                           = new MapModelTexture(new ModelM41A(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/pulserifle.png"));
        public final MapModelTexture<ModelM56SG>                  M56SG                          = new MapModelTexture(new ModelM56SG(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/m56sg.png"));
        public final MapModelTexture<ModelAK47>                   AK47                           = new MapModelTexture(new ModelAK47(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/ak-47.png"));
        public final MapModelTexture<ModelM4>                     M4                             = new MapModelTexture(new ModelM4(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/m4.png"));
        public final MapModelTexture<ModelSniper>                 SNIPER                         = new MapModelTexture(new ModelSniper(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/sniper.png"));
        public final MapModelTexture<ModelM40>                    M40GRENADE                     = new MapModelTexture(new ModelM40(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/m40.png"));
        public final MapModelTexture<ModelM40>                    M40GRENADE_INCENDIARY          = new MapModelTexture(new ModelM40(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/m40incendiary.png"));
        public final MapModelTexture<ModelMotionTracker>          MOTIONTRACKER                  = new MapModelTexture(new ModelMotionTracker(), new Texture(AliensVsPredator.Properties.ID, "textures/items/models/motiontracker.png"));
        public final MapModelTexture<ModelTurret>                 TURRET                         = new MapModelTexture(new ModelTurret(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/turret.png"));
        public final MapModelTexture<ModelWorkstation>            WORKSTATION                    = new MapModelTexture(new ModelWorkstation(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/workstation.png"));
        public final MapModelTexture<ModelWorkstation>            WORKSTATION_MASK               = new MapModelTexture(new ModelWorkstation(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/workstation-on.png"));
        public final MapModelTexture<ModelLightPanel>             LIGHT_PANEL                    = new MapModelTexture(new ModelLightPanel(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/lightpanel.png"));
        public final MapModelTexture<ModelCryostasisTube>         CRYOSTASIS_TUBE                = new MapModelTexture(new ModelCryostasisTube(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/cryostasistube.png"));
        public final MapModelTexture<ModelCryostasisTube>         CRYOSTASIS_TUBE_MASK           = new MapModelTexture(new ModelCryostasisTube(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/cryostasistube-mask.png"));
        public final MapModelTexture<ModelCryostasisTube>         CRYOSTASIS_TUBE_MASK_CRACKED   = new MapModelTexture(new ModelCryostasisTube(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/cryostasistube-cracked-mask.png"));
        public final MapModelTexture<ModelCryostasisTube>         CRYOSTASIS_TUBE_MASK_SHATTERED = new MapModelTexture(new ModelCryostasisTube(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/cryostasistube-shattered-mask.png"));
        public final MapModelTexture<ModelStasisMechanism>        STASIS_MECHANISM               = new MapModelTexture(new ModelStasisMechanism(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/stasis-mechanism.png"));
        public final MapModelTexture<ModelStasisMechanism>        STASIS_MECHANISM_MASK          = new MapModelTexture(new ModelStasisMechanism(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/stasis-mechanism-mask.png"));
        public final MapModelTexture<ModelMedpod>                 MEDPOD                         = new MapModelTexture(new ModelMedpod(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/medpod.png"));
        public final MapModelTexture<ModelMedpod>                 MEDPOD_MASK                    = new MapModelTexture(new ModelMedpod(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/medpod-on.png"));
        public final MapModelTexture<ModelRepulsionGenerator>     REPULSION_GENERATOR            = new MapModelTexture(new ModelRepulsionGenerator(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/generator.png"));
        public final MapModelTexture<ModelCable>                  CABLE                          = new MapModelTexture(new ModelCable(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/cable.png"));
        public final MapModelTexture<ModelBlastdoor>              BLASTDOOR                      = new MapModelTexture(new ModelBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/blastdoor.png"));
        public final MapModelTexture<ModelSevastopolBlastdoor>    BLASTDOOR_SEVASTOPOL           = new MapModelTexture(new ModelSevastopolBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/sevastopolblastdoor.png"));
        public final MapModelTexture<ModelSevastopolBlastdoor>    BLASTDOOR_SEVASTOPOL_LOCKED    = new MapModelTexture(new ModelSevastopolBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/sevastopolblastdoor_locked.png"));
        public final MapModelTexture<ModelSevastopolBlastdoor>    BLASTDOOR_SEVASTOPOL_UNLOCKED  = new MapModelTexture(new ModelSevastopolBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/sevastopolblastdoor_unlocked.png"));
        public final MapModelTexture<ModelSevastopolBlastdoor>    BLASTDOOR_SEVASTOPOL_ENABLED   = new MapModelTexture(new ModelSevastopolBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/sevastopolblastdoor_power_on.png"));
        public final MapModelTexture<ModelSevastopolBlastdoor>    BLASTDOOR_SEVASTOPOL_DISABLED  = new MapModelTexture(new ModelSevastopolBlastdoor(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/sevastopolblastdoor_power_off.png"));
        public final MapModelTexture<ModelCCFL>                   CCFL_BALLAST                   = new MapModelTexture(new ModelCCFL(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/ccfl_ballast.png"));
        public final MapModelTexture<ModelCCFL>                   CCFL_TUBE_ON                   = new MapModelTexture(new ModelCCFL(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/ccfl_on.png"));
        public final MapModelTexture<ModelCCFL>                   CCFL_TUBE_OFF                  = new MapModelTexture(new ModelCCFL(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/ccfl_off.png"));
        public final MapModelTexture<ModelChestburster>           CHESTBUSTER                    = new MapModelTexture(new ModelChestburster(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/chestburster.png"));
        public final MapModelTexture<ModelChestbursterPredalien>  CHESTBUSTER_PREDALIEN          = new MapModelTexture(new ModelChestbursterPredalien(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/chestburster_predalien.png"));
        public final MapModelTexture<ModelChestbursterQueen>      CHESTBUSTER_QUEEN              = new MapModelTexture(new ModelChestbursterQueen(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/chestburster_queen.png"));
        public final MapModelTexture<ModelChestbursterRunner>     CHESTBUSTER_RUNNER             = new MapModelTexture(new ModelChestbursterRunner(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/chestburster_runner.png"));
        public final MapModelTexture<ModelFacehugger>             FACEHUGGER                     = new MapModelTexture(new ModelFacehugger(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/facehugger.png"));
        public final MapModelTexture<ModelRoyalFacehugger>        ROYALFACEHUGGER                = new MapModelTexture(new ModelRoyalFacehugger(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/royalfacehugger.png"));
        public final MapModelTexture<ModelMarine>                 MARINE                         = new MapModelTexture(new ModelMarine(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/marine.png"));
        public final MapModelTexture<ModelOvamorph>               OVAMORPH                       = new MapModelTexture(new ModelOvamorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/alienegg.png"));
        public final MapModelTexture<ModelPredalien>              PREDALIEN                      = new MapModelTexture(new ModelPredalien(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/predalien.png"));
        public final MapModelTexture<ModelPraetorian>             PRAETORIAN                     = new MapModelTexture(new ModelPraetorian(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/praetorian.png"));
        public final MapModelTexture<ModelWarrior>                WARRIOR                        = new MapModelTexture(new ModelWarrior(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/warrior.png"));
        public final MapModelTexture<ModelWarrior>                WARRIOR_BLOOD                  = new MapModelTexture(new ModelWarrior(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/warrior_blood.png"));
        public final MapModelTexture<ModelDrone>                  DRONE_BASIC_BLOOD              = new MapModelTexture(new ModelDrone(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/drone_basic_blood.png"));
        public final MapModelTexture<ModelDrone>                  DRONE_ADVANCED_BLOOD           = new MapModelTexture(new ModelDrone(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/drone_advanced_blood.png"));
        public final MapModelTexture<ModelHammerpede>             HAMMERPEDE                     = new MapModelTexture(new ModelHammerpede(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/hammerpede.png"));
        public final MapModelTexture<ModelTrilobite>              TRILOBITE                      = new MapModelTexture(new ModelTrilobite(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/trilobite.png"));
        public final MapModelTexture<ModelDeaconShark>            DEACON_SHARK                   = new MapModelTexture(new ModelDeaconShark(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/deacon_shark.png"));
        public final MapModelTexture<ModelDeacon>                 DEACON                         = new MapModelTexture(new ModelDeacon(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/deacon.png"));
        public final MapModelTexture<ModelDeaconAdult>            DEACON_ADULT                   = new MapModelTexture(new ModelDeaconAdult(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/deacon_adult.png"));
        public final MapModelTexture<ModelAqua>                   AQUA_XENOMORPH                 = new MapModelTexture(new ModelAqua(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/aqua.png"));
        public final MapModelTexture<ModelAqua>                   AQUA_XENOMORPH_MASK            = new MapModelTexture(new ModelAqua(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/aqua_glow.png"));
        public final MapModelTexture<ModelMatriarch>              MATRIARCH                      = new MapModelTexture(new ModelMatriarch(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/matriarch.png"));
        public final MapModelTexture<ModelMatriarch>              MATRIARCH_MASK                 = new MapModelTexture(new ModelMatriarch(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/matriarch_mask.png"));
        public final MapModelTexture<ModelYautja>                 YAUTJA_WARRIOR                 = new MapModelTexture(new ModelYautja(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/yautja.png"));
        public final MapModelTexture<ModelYautja>                 YAUTJA_BERSERKER               = new MapModelTexture(new ModelYautja(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/yautja_berserker.png"));
        public final MapModelTexture<ModelSpitter>                SPITTER                        = new MapModelTexture(new ModelSpitter(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/spitter.png"));
        public final MapModelTexture<ModelSpitter>                SPITTER_MASK                   = new MapModelTexture(new ModelSpitter(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/spitter_glow.png"));
        public final MapModelTexture<ModelCrusher>                CRUSHER                        = new MapModelTexture(new ModelCrusher(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/crusher.png"));
        public final MapModelTexture<SpecialModelBiped>           COMBAT_SYNTHETIC               = new MapModelTexture(new SpecialModelBiped(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/combat_synthetic.png"));
        public final MapModelTexture<ModelSupplyChute>            SUPPLY_CHUTE                   = new MapModelTexture(new ModelSupplyChute(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/supplychute.png"));
        public final MapModelTexture<ModelSupplyChute>            SUPPLY_CHUTE_MARINES           = new MapModelTexture(new ModelSupplyChute(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/supplychute.marines.png"));
        public final MapModelTexture<ModelSupplyChute>            SUPPLY_CHUTE_SEEGSON           = new MapModelTexture(new ModelSupplyChute(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/supplychute.seegson.png"));
        public final MapModelTexture<SpecialModelBiped>           BIPED                          = new MapModelTexture(new SpecialModelBiped(), new Texture(""));
        public final MapModelTexture<ModelLaserMine>              LASER_MINE                     = new MapModelTexture(new ModelLaserMine(), new Texture(AliensVsPredator.Properties.ID, "textures/misc/proximity-mine.png"));
        public final MapModelTexture<ModelDNASynthesizer>         DNA_SYNTHESIZER                = new MapModelTexture(new ModelDNASynthesizer(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/dna-synthesizer.png"));
        public final MapModelTexture<ModelHiveResin>              HIVE_RESIN                     = new MapModelTexture(new ModelHiveResin(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/hive-resin.png"));
        public final MapModelTexture<ModelGooMutant>              GOO_MUTANT                     = new MapModelTexture(new ModelGooMutant(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/goomutant.png"));
        public final MapModelTexture<ModelWarrior>                DRONE_SKULL                    = new MapModelTexture(new ModelWarrior(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/xenomorphskullgiger.png"));
        public final MapModelTexture<ModelWarrior>                WARRIOR_SKULL                  = new MapModelTexture(new ModelWarrior(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/xenomorphskullwarrior.png"));
        public final MapModelTexture<ModelYautja>                 YAUTJA_SKULL                   = new MapModelTexture(new ModelYautja(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/yautjaskull.png"));
        public final MapModelTexture<ModelMatriarch>              QUEEN_SKULL                    = new MapModelTexture(new ModelMatriarch(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/queenskull.png"));
        public final MapModelTexture<ModelOctohugger>             OCTOHUGGER                     = new MapModelTexture(new ModelOctohugger(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/octohugger.png"));
        public final MapModelTexture<ModelBelugaburster>          BELUGABURSTER                  = new MapModelTexture(new ModelBelugaburster(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/belugaburster.png"));
        public final MapModelTexture<ModelBelugamorph>            BELUGAMORPH                    = new MapModelTexture(new ModelBelugamorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/belugamorph.png"));
        public final MapModelTexture<ModelRedstoneFluxGenerator>  RFGENERATOR                    = new MapModelTexture(new ModelRedstoneFluxGenerator(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/redstonefluxgenerator.png"));
        public final MapModelTexture<ModelBabyhead>               BABYHEAD                       = new MapModelTexture(new ModelBabyhead(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/babyhead.png"));
        public final MapModelTexture<ModelBatXenomorph>           BAT_XENO                       = new MapModelTexture(new ModelBatXenomorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/batxeno.png"));
        public final MapModelTexture<ModelBoiler>                 BOILER                         = new MapModelTexture(new ModelBoiler(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/boiler.png"));
        public final MapModelTexture<ModelBoiler>                 BOILER_MASK                    = new MapModelTexture(new ModelBoiler(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/boiler_glow.png"));
        public final MapModelTexture<ModelDracoburster>           DRACOBURSTER                   = new MapModelTexture(new ModelDracoburster(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/dracoburster.png"));
        public final MapModelTexture<ModelDracomorph>             DRACOMORPH                     = new MapModelTexture(new ModelDracomorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/dracomorph.png"));
        public final MapModelTexture<ModelDracoOvamorph>          DRACO_OVAMORPH                 = new MapModelTexture(new ModelDracoOvamorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/dracomorphegg.png"));
        public final MapModelTexture<ModelMutantYautja>           MUTANT_YAUTJA                  = new MapModelTexture(new ModelMutantYautja(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/yautjamutant.png"));
        public final MapModelTexture<ModelMyceliomorph>           MYCELIOMORPH                   = new MapModelTexture(new ModelMyceliomorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/myceliomorph.png"));
        public final MapModelTexture<ModelMyceliomorph>           MYCELIOMORPH_MASK              = new MapModelTexture(new ModelMyceliomorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/myceliomorph_glow.png"));
        public final MapModelTexture<ModelPantheramorph>          PANTHERAMORPH                  = new MapModelTexture(new ModelPantheramorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/pantheramorph.png"));
        public final MapModelTexture<ModelPredatorHound>          PREDATOR_HOUND                 = new MapModelTexture(new ModelPredatorHound(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/predatorhound.png"));
        public final MapModelTexture<ModelUrsuidae>               URSUIDAE                       = new MapModelTexture(new ModelUrsuidae(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/vardaboar.png"));
        public final MapModelTexture<ModelVardaMonkey>            VARDA_MONKEY                   = new MapModelTexture(new ModelVardaMonkey(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/vardamonkey.png"));

        public final MapModelTexture<ModelGroundFern>             GROUND_FERN                    = new MapModelTexture(new ModelGroundFern(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/plants/paradisiangroundfern.png"));
        public final MapModelTexture<ModelTreeFern>               TREE_FERN                      = new MapModelTexture(new ModelTreeFern(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/plants/paradisiantreefern.png"));
        public final MapModelTexture<ModelSporePod>               SPOREPOD                       = new MapModelTexture(new ModelSporePod(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/sporepods.png"));

        /** New xenomorph model format **/
        public final MapModelTexture<ModelUltramorph>             ULTRAMORPH                     = new MapModelTexture(new ModelUltramorph(), new Texture(AliensVsPredator.Properties.ID, "textures/mob/ultramorph.png"));

        /** Wavefront models **/
        public final TriangulatedWavefrontModel                   M577_APC                       = WavefrontModelLoader.load(AliensVsPredator.class, AliensVsPredator.Properties.ID, "m577apc", "/assets/avp/models/m577apc");

        public final MapModelTexture<ModelNetworkModuleRack>      NETWORKMODULERACK              = new MapModelTexture(new ModelNetworkModuleRack(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/networkmodulerack.png"));
        public final MapModelTexture<ModelNetworkModuleRack>      NETWORKMODULERACK_ON           = new MapModelTexture(new ModelNetworkModuleRack(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/networkmodulerack_on.png"));
        public final MapModelTexture<ModelNetworkModuleRack>      NETWORKMODULERACK_OFF          = new MapModelTexture(new ModelNetworkModuleRack(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/networkmodulerack_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE1                    = new MapModelTexture(new ModelRackModule1(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent01.png"));
        public final MapModelTexture<Model>                       RACKMODULE1_ON                 = new MapModelTexture(new ModelRackModule1(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent01_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE1_OFF                = new MapModelTexture(new ModelRackModule1(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent01_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE2                    = new MapModelTexture(new ModelRackModule2(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent02.png"));
        public final MapModelTexture<Model>                       RACKMODULE2_ON                 = new MapModelTexture(new ModelRackModule2(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent02_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE2_OFF                = new MapModelTexture(new ModelRackModule2(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent02_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE3                    = new MapModelTexture(new ModelRackModule3(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent03.png"));
        public final MapModelTexture<Model>                       RACKMODULE3_ON                 = new MapModelTexture(new ModelRackModule3(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent03_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE3_OFF                = new MapModelTexture(new ModelRackModule3(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent03_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE4                    = new MapModelTexture(new ModelRackModule4(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent04.png"));
        public final MapModelTexture<Model>                       RACKMODULE4_ON                 = new MapModelTexture(new ModelRackModule4(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent04_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE4_OFF                = new MapModelTexture(new ModelRackModule4(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent04_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE5                    = new MapModelTexture(new ModelRackModule5(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent05.png"));
        public final MapModelTexture<Model>                       RACKMODULE5_ON                 = new MapModelTexture(new ModelRackModule5(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent05_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE5_OFF                = new MapModelTexture(new ModelRackModule5(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent05_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE6                    = new MapModelTexture(new ModelRackModule6(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent06.png"));
        public final MapModelTexture<Model>                       RACKMODULE6_ON                 = new MapModelTexture(new ModelRackModule6(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent06_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE6_OFF                = new MapModelTexture(new ModelRackModule6(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent06_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE7                    = new MapModelTexture(new ModelRackModule7(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent07.png"));
        public final MapModelTexture<Model>                       RACKMODULE7_ON                 = new MapModelTexture(new ModelRackModule7(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent07_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE7_OFF                = new MapModelTexture(new ModelRackModule7(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent07_off.png"));

        public final MapModelTexture<Model>                       RACKMODULE8                    = new MapModelTexture(new ModelRackModule8(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent08.png"));
        public final MapModelTexture<Model>                       RACKMODULE8_ON                 = new MapModelTexture(new ModelRackModule8(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent08_on.png"));
        public final MapModelTexture<Model>                       RACKMODULE8_OFF                = new MapModelTexture(new ModelRackModule8(), new Texture(AliensVsPredator.Properties.ID, "textures/tile/rackmodules/servercomponent08_off.png"));
    }

    public final Texture SKY_VARDA_CLOUDS         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/varda-clouds.png");
    public final Texture SKY_SILICA               = new Texture(AliensVsPredator.Properties.ID, "textures/misc/silica.png");
    public final Texture SKY_CALPAMOS             = new Texture(AliensVsPredator.Properties.ID, "textures/misc/calpamos.png");
    public final Texture SKY_VARDA                = new Texture(AliensVsPredator.Properties.ID, "textures/misc/varda.png");
    public final Texture SKY_ACHERON              = new Texture(AliensVsPredator.Properties.ID, "textures/misc/acheron.png");
    public final Texture TITANIUM1                = new Texture(AliensVsPredator.Properties.ID, "textures/armor/titanium_1.png");
    public final Texture TITANIUM2                = new Texture(AliensVsPredator.Properties.ID, "textures/armor/titanium_2.png");
    public final Texture PRESSURESUIT1            = new Texture(AliensVsPredator.Properties.ID, "textures/armor/suit_1.png");
    public final Texture PRESSURESUIT2            = new Texture(AliensVsPredator.Properties.ID, "textures/armor/suit_2.png");
    public final Texture MK501                    = new Texture(AliensVsPredator.Properties.ID, "textures/armor/mk50_1.png");
    public final Texture MK502                    = new Texture(AliensVsPredator.Properties.ID, "textures/armor/mk50_2.png");
    public final Texture XENO1                    = new Texture(AliensVsPredator.Properties.ID, "textures/armor/xeno_1.png");
    public final Texture XENO2                    = new Texture(AliensVsPredator.Properties.ID, "textures/armor/xeno_2.png");
    public final Texture MARINE1                  = new Texture(AliensVsPredator.Properties.ID, "textures/armor/marine_1.png");
    public final Texture MARINE2                  = new Texture(AliensVsPredator.Properties.ID, "textures/armor/marine_2.png");
    public final Texture ACID_POOL                = new Texture(AliensVsPredator.Properties.ID, "textures/misc/acidpool.png");
    public final Texture LIQUID_POOL              = new Texture(AliensVsPredator.Properties.ID, "textures/misc/liquidpool.png");
    public final Texture DISC                     = new Texture(AliensVsPredator.Properties.ID, "textures/misc/disc.png");
    public final Texture SHURIKEN                 = new Texture(AliensVsPredator.Properties.ID, "textures/misc/shuriken.png");
    public final Texture BLUR_CELTIC_HUD          = new Texture(AliensVsPredator.Properties.ID, "textures/misc/celtic-helm-overlay.png");
    public final Texture BLUR_TACTICAL_HUD        = new Texture(AliensVsPredator.Properties.ID, "textures/misc/marine-helm-overlay.png");
    public final Texture BLUR_FACEHUGGER          = new Texture(AliensVsPredator.Properties.ID, "textures/misc/facehugger.png");
    public final Texture BLUR_CHESTBURSTER_EMERGE = new Texture(AliensVsPredator.Properties.ID, "textures/misc/chestburster-emerge-overlay.png");
    public final Texture BATTERY_INDICATOR        = new Texture(AliensVsPredator.Properties.ID, "textures/misc/battery-indicator.png");
    public final Texture INFECTION_INDICATOR      = new Texture(AliensVsPredator.Properties.ID, "textures/misc/infection-indicator.png");
    public final Texture BLUR_GUNSCOPE            = new Texture(AliensVsPredator.Properties.ID, "textures/misc/scope.png");
    public final Texture GUI_BASIC                = new Texture(AliensVsPredator.Properties.ID, "textures/gui/background.png");
    public final Texture GUI_TURRET               = new Texture(AliensVsPredator.Properties.ID, "textures/gui/turret.png");
    public final Texture GUI_NETWORK_RACK         = new Texture(AliensVsPredator.Properties.ID, "textures/gui/networkrack.png");
    public final Texture GUI_WRISTBRACER          = new Texture(AliensVsPredator.Properties.ID, "textures/gui/wristbracer.png");
    public final Texture GUI_LOCKER               = new Texture(AliensVsPredator.Properties.ID, "textures/gui/locker.png");
    public final Texture GUI_ASSEMBLER            = new Texture(AliensVsPredator.Properties.ID, "textures/gui/assembler.png");
    public final Texture GUI_SUPPLYCRATE          = new Texture(AliensVsPredator.Properties.ID, "textures/gui/supplycrate.png");
    public final Texture GUI_REPULSION_GENERATOR  = new Texture(AliensVsPredator.Properties.ID, "textures/gui/repulsion_generator.png");
    public final Texture ICON_AMMO                = new Texture(AliensVsPredator.Properties.ID, "textures/misc/icon-ammo.png");
    public final Texture MOTIONTRACKER_BG         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/background.png");
    public final Texture MOTIONTRACKER_FG         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/foreground.png");
    public final Texture MOTIONTRACKER_PING       = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/ping.png");
    public final Texture MOTIONTRACKER_S1         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep1.png");
    public final Texture MOTIONTRACKER_S2         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep2.png");
    public final Texture MOTIONTRACKER_S3         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep3.png");
    public final Texture MOTIONTRACKER_S4         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep4.png");
    public final Texture MOTIONTRACKER_S5         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep5.png");
    public final Texture MOTIONTRACKER_S6         = new Texture(AliensVsPredator.Properties.ID, "textures/misc/motiontracker/sweep6.png");
    public final Texture QUEEN_BOSS_BAR           = new Texture(AliensVsPredator.Properties.ID, "textures/misc/queenbossbar.png");
    public final Texture MIST                     = new Texture(AliensVsPredator.Properties.ID, "textures/blocks/mist.still.png");
    public final Texture BLACKGOO                 = new Texture(AliensVsPredator.Properties.ID, "textures/blocks/blackgoo.png");
    public final Texture REFLECTION               = new Texture(AliensVsPredator.Properties.ID, "textures/blocks/reflection.png");
    public final Texture RES_UNDERWATER_OVERLAY   = new Texture("textures/misc/underwater.png");
}
