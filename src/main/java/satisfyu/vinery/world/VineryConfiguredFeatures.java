package satisfyu.vinery.world;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;

import java.util.List;
import java.util.function.Predicate;


public class VineryConfiguredFeatures {

    /*
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> TAIGA_RED_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("taiga_red_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.TAIGA_RED_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 2))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> TAIGA_RED_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("taiga_red_grape_bush_chance"), TAIGA_RED_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> TAIGA_WHITE_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("taiga_white_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.TAIGA_WHITE_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 2))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> TAIGA_WHITE_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("taiga_white_grape_bush_chance"), TAIGA_WHITE_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> SAVANNA_RED_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("savanna_red_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.SAVANNA_RED_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> SAVANNA_RED_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("savanna_red_grape_bush_chance"), SAVANNA_RED_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> SAVANNA_WHITE_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("savanna_white_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.SAVANNA_WHITE_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> SAVANNA_WHITE_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("savanna_white_grape_bush_chance"), SAVANNA_WHITE_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> RED_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("red_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.RED_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> RED_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("red_grape_bush_chance"), RED_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> WHITE_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("white_grape_bush"), Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ObjectRegistry.WHITE_GRAPE_BUSH.getDefaultState().with(GrapeBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK), 36));
    public static final RegistryEntry<PlacedFeature> WHITE_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("white_grape_bush_chance"), WHITE_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY = ConfiguredFeatures.register(VineryIdentifier.asString("cherry"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.CHERRY_LOG), new StraightTrunkPlacer(5, 2, 0), cherryLeaveProvider(), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_VARIANT = ConfiguredFeatures.register(VineryIdentifier.asString("cherry_variant"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.CHERRY_LOG), new StraightTrunkPlacer(5, 2, 0), cherryLeaveProvider(), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> OLD_CHERRY = ConfiguredFeatures.register(VineryIdentifier.asString("old_cherry"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.OLD_CHERRY_LOG), new LargeOakTrunkPlacer(4, 14, 2), cherryLeaveProvider(), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of()).forceDirt().build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> OLD_CHERRY_BEE = ConfiguredFeatures.register(VineryIdentifier.asString("old_cherry_bee"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.OLD_CHERRY_LOG), new LargeOakTrunkPlacer(4, 14, 2), cherryLeaveProvider(), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.5f))).forceDirt().build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> OLD_CHERRY_VARIANT = ConfiguredFeatures.register(VineryIdentifier.asString("old_cherry_variant"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.OLD_CHERRY_LOG), new LargeOakTrunkPlacer(4, 14, 2), cherryLeaveProvider(), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of()).forceDirt().build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> OLD_CHERRY_VARIANT_WITH_BEE = ConfiguredFeatures.register(VineryIdentifier.asString("old_cherry_variant_with_bee"), Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ObjectRegistry.OLD_CHERRY_LOG), new LargeOakTrunkPlacer(4, 14, 2), cherryLeaveProvider(), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.5f))).forceDirt().build());

    public static final Feature<DefaultFeatureConfig> JUNGLE_RED_GRAPE_FEATURE = register("jungle_red_grape_feature", new JungleRedBushFeature(DefaultFeatureConfig.CODEC));
    public static final Feature<DefaultFeatureConfig> JUNGLERWHITE_GRAPE_FEATURE = register("jungle_white_grape_feature", new JungleWhiteBushFeature(DefaultFeatureConfig.CODEC));
    public static final RegistryEntry<ConfiguredFeature<DefaultFeatureConfig, ?>> JUNGLE_RED_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("jungle_red_grape_bush_patch"), JUNGLE_RED_GRAPE_FEATURE);
    public static final RegistryEntry<ConfiguredFeature<DefaultFeatureConfig, ?>> JUNGLE_WHITE_GRAPE_BUSH_PATCH = ConfiguredFeatures.register(VineryIdentifier.asString("jungle_white_grape_bush_patch"), JUNGLERWHITE_GRAPE_FEATURE);
    public static final RegistryEntry<PlacedFeature> JUNGLE_RED_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("jungle_red_grape_bush_chance"), JUNGLE_RED_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> JUNGLE_WHITE_GRAPE_PATCH_CHANCE = PlacedFeatures.register(VineryIdentifier.asString("jungle_white_grape_bush_chance"), JUNGLE_WHITE_GRAPE_BUSH_PATCH, RarityFilterPlacementModifier.of(92), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());





    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registry.FEATURE, name, feature);
    }

    public static final RegistryEntry<PlacedFeature> TREE_CHERRY = PlacedFeatures.register("tree_cherry", CHERRY, VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.01f, 1), ObjectRegistry.CHERRY_SAPLING));
    public static final RegistryEntry<PlacedFeature> TREE_CHERRY_OLD = PlacedFeatures.register("tree_cherry_old", OLD_CHERRY, VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.01f, 1), ObjectRegistry.OLD_CHERRY_SAPLING));

    public static WeightedBlockStateProvider cherryLeaveProvider(){
        return new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ObjectRegistry.CHERRY_LEAVES.getDefaultState(), 10).add(ObjectRegistry.CHERRY_LEAVES.getDefaultState().with(VARIANT, true), 4).add(ObjectRegistry.CHERRY_LEAVES.getDefaultState().with(VARIANT, true).with(CherryLeaves.HAS_CHERRIES, true), 2));
    }

    public static void init() {
        BiomeModification world = BiomeModifications.create(new VineryIdentifier("world_features"));
        Predicate<BiomeSelectionContext> plainsBiomes = BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.PLAINS, BiomeKeys.SWAMP, BiomeKeys.BIRCH_FOREST, BiomeKeys.MEADOW, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.RIVER);
        Predicate<BiomeSelectionContext> savannaBiomes = BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.WOODED_BADLANDS);
        Predicate<BiomeSelectionContext> taigaBiomes = BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.SNOWY_TAIGA);
        Predicate<BiomeSelectionContext> jungleBiomes = BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.WOODED_BADLANDS);


        world.add(ModificationPhase.ADDITIONS, plainsBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, RED_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, plainsBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, WHITE_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, savannaBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, SAVANNA_RED_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, savannaBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, SAVANNA_WHITE_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, taigaBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, TAIGA_RED_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, taigaBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, TAIGA_WHITE_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, jungleBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, JUNGLE_RED_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, jungleBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, JUNGLE_WHITE_GRAPE_PATCH_CHANCE.value()));
        world.add(ModificationPhase.ADDITIONS, getTreesSelector(), ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, TREE_CHERRY.value()));
        world.add(ModificationPhase.ADDITIONS, getTreesSelector(), ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, TREE_CHERRY_OLD.value()));
    }

     */
 
	private static Predicate<BiomeSelectionContext> getTreesSelector() {
        return BiomeSelectors.tag(TagKey.of(RegistryKeys.BIOME, new Identifier("vinery:has_structure/tree")));
	}

    private static BlockPredicate createBlockPredicate(List<Block> validGround) {
        return !validGround.isEmpty() ? BlockPredicate.bothOf(BlockPredicate.IS_AIR, BlockPredicate.matchingBlocks(validGround)) : BlockPredicate.IS_AIR;
    }
}

