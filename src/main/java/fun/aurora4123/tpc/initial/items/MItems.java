package fun.aurora4123.tpc.initial.items;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.ModBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MItems {
    //创建注册机，create中传入要注册的物品类型和modid
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouhouPixelCanteen.MODID);
    //使用RegistryObject通过注册机注册一个物品；
    public static final RegistryObject<Item> CASH =
                            //----↓注册名-------↓要注册的类型-------↓属性
            ITEMS.register("cash", () -> new Item(new Item.Properties().stacksTo(10240)));
    //注册方块对应的物品
    public static final RegistryObject<Item> DESK =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.DESK.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.DESK.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    //凳子
    public static final RegistryObject<Item> STOOL =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.STOOL.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.STOOL.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DISH =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.DISH.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.DISH.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    //第一份可放置食物
    public static final RegistryObject<Item> SCRAMBLED_EGGS_WITH_TOMATO =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.SCRAMBLED_EGGS_WITH_TOMATO.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.SCRAMBLED_EGGS_WITH_TOMATO.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(9)
                                                    .saturationMod(0.5F)
                                                    .build()
                                    )
                                    .craftRemainder(MItems.DISH.get())
                    ));

    public static final RegistryObject<Item> UNPROCESS_DISH =
            ITEMS.register("unprocess_dish", () -> new Item(new Item.Properties().stacksTo(64)));

    //金胡萝卜和烤土豆
    public static final RegistryObject<Item> POTATO_AND_CARROT =
          ITEMS.register(
                  "cooked_potato_and_gold_carrot",
                  () -> new Item(
                          new Item.Properties()
                                  .food(
                                          new FoodProperties.Builder()
                                                  .nutrition(11)
                                                  .saturationMod(0.92F)
                                                  .build()
                                  )
                  )
          );
    //是的，植物，辣椒
    public static final RegistryObject<Item> CHILI_PEPPER_SEED =
            ITEMS.register("chili_pepper_seed",
                    () -> new ItemNameBlockItem(ModBlocks.CHILI_PEPPER_BLOCK.get(), basicItem()));
    //醋桶
    public static final RegistryObject<Item> VINEGAR_BUCKET =
            ITEMS.register("vinegar_bucket", () -> new Item(new Item.Properties().stacksTo(1)));

    //蛋液
    public static final RegistryObject<Item> EGG_WASH =
            ITEMS.register(
                    "egg_wash",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(2)
                                                    .saturationMod(0.1F)
                                                    .build()
                                    )
                    )
            );
    //水煮蛋
    public static final RegistryObject<Item> BOILED_EGG =
            ITEMS.register(
                    "boilsh_egg",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(4)
                                                    .saturationMod(0.3F)
                                                    .build()
                                    )
                    )
            );
    //去皮水煮蛋
    public static final RegistryObject<Item> BOILED_EGG_PEELED =
            ITEMS.register(
                    "boilsh_egg_peeled",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(4)
                                                    .saturationMod(0.3F)
                                                    .build()
                                    )
                    )
            );
    //切开的去皮水煮蛋
    public static final RegistryObject<Item> BOILED_EGG_PEELED_HALF =
            ITEMS.register(
                    "boilsh_egg_peeled_half",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(2)
                                                    .saturationMod(0.2F)
                                                    .build()
                                    )
                    )
            );
    //茶叶蛋
    public static final RegistryObject<Item> TEA_EGG =
            ITEMS.register(
                    "tea_egg",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(7)
                                                    .saturationMod(0.4F)
                                                    .build()
                                    )
                    )
            );
    //西瓜瓤
    public static final RegistryObject<Item> MELON_FLESH =
            ITEMS.register(
                    "melon_flesh",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(2)
                                                    .saturationMod(0.5F)
                                                    .build()
                                    )
                    )
            );
    //西瓜皮
    public static final RegistryObject<Item> MELON_RIND =
            ITEMS.register(
                    "melon_rind",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(1)
                                                    .saturationMod(0.1F)
                                                    .build()
                                    )
                    )
            );
    //麦芽糖
    public static final RegistryObject<Item> MALTOSE =
            ITEMS.register(
                    "maltose",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(4)
                                                    .saturationMod(0.4F)
                                                    .fast()
                                                    .build()

                                    )
                    )
            );
    //辣椒喵（呜呜呜“被超级邪恶名字还特别长的猫娘大王压榨EV”半夜被“不邪恶超级好名字还特别长的猫娘大王”压榨了，呜呜呜）
    public static final RegistryObject<Item> CHILI_PEPPER =
            ITEMS.register(
                    "chili_pepper",
                    () -> new Item(
                            new Item.Properties()
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(1)
                                                    .saturationMod(0.1F)
                                                    .fast()
                                                    .build()

                                    )
                    )
            );
    //第一份喜晋升的可放置食物
    public static final RegistryObject<Item> EGG_CUSTARD =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.EGG_CUSTARD.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.EGG_CUSTARD.get(),
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(5)
                                                    .saturationMod(0.3F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    )
            );
    //这么多东西都是一个不懂jvav的人写的，这世道
    //蛋盖饭
    public static final RegistryObject<Item> RICE_WITH_EGG =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.RICE_WITH_EGG.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.RICE_WITH_EGG.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(9)
                                                    .saturationMod(0.55F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    //亲子烧
    public static final RegistryObject<Item> OYAKODON =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.OYAKODON.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.OYAKODON.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(10)
                                                    .saturationMod(0.6F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    //紫菜蛋花汤没有菜和花
    public static final RegistryObject<Item> SEAWEED_AND_EGG_SOUP =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.SEAWEED_AND_EGG_SOUP.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.SEAWEED_AND_EGG_SOUP.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(9)
                                                    .saturationMod(0.55F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    //咸菜粥
    public static final RegistryObject<Item> PICKLE_CONGEE =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.PICKLE_CONGEE.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.PICKLE_CONGEE.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(11)
                                                    .saturationMod(0.55F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    //史莱姆滑蘑菇
    public static final RegistryObject<Item> SLIME_SWIRLED_MUSHROOMS
            =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.SLIME_SWIRLED_MUSHROOMS.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.SLIME_SWIRLED_MUSHROOMS.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(12)
                                                    .saturationMod(0.65F)
                                                    .effect(() -> new MobEffectInstance(
                                                            MobEffects.MOVEMENT_SPEED, 150, 2), 1.0F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    public static final RegistryObject<Item> RICE_CONGEE =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.RICE_CONGEE.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.RICE_CONGEE.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(9)
                                                    .saturationMod(0.58F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    public static final RegistryObject<Item> PUMPKIN_CONGEE =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.PUMPKIN_CONGEE.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.PUMPKIN_CONGEE.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(9)
                                                    .saturationMod(0.7F)
                                                    .build()
                                    )
                                    .craftRemainder(Items.BOWL)
                    ));
    //玉子烧
    public static final RegistryObject<Item> TAMAGO =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.TAMAGO.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.TAMAGO.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(12)
                                                    .saturationMod(0.65F)
                                                    .build()
                                    )
                                    .craftRemainder(MItems.DISH.get())
                    ));
    //终极黑暗料理：西湖醋鱼
    public static final RegistryObject<Item> WESTLAKE_FISH =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.WESTLAKE_FISH.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.WESTLAKE_FISH.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(12)
                                                    .saturationMod(0.65F)
                                                    .effect(() -> new MobEffectInstance(
                                                            MobEffects.DARKNESS, 300, 0), 0.3F)
                                                    .effect(() -> new MobEffectInstance(
                                                            MobEffects.CONFUSION, 300, 0), 0.1F)
                                                    .build()
                                    )
                                    .craftRemainder(MItems.DISH.get())
                    ));
    //东坡肉
    public static final RegistryObject<Item> DONGPO_PORK =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.DONGPO_PORK.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.DONGPO_PORK.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(12)
                                                    .saturationMod(0.65F)
                                                    .build()
                                    )
                                    .craftRemainder(MItems.DISH.get())
                    ));
    public static final RegistryObject<Item> FIRED_SOYBEAN_SCUM_ROL =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.FIRED_SOYBEAN_SCUM_ROL.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.FIRED_SOYBEAN_SCUM_ROL.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties()
                                    .stacksTo(16)
                                    .food(
                                            new FoodProperties.Builder()
                                                    .nutrition(11)
                                                    .saturationMod(0.6F)
                                                    .build()
                                    )
                                    .craftRemainder(MItems.DISH.get())
                    ));
    //蛋壳
    public static final RegistryObject<Item> EGGSHELL =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.EGGSHELL.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.EGGSHELL.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(256)));

//    public static final RegistryObject<Item> FOOD =
//            ITEMS.register(
//                    "example_food",
//                    () -> new Item(
//                            new Item.Properties()------物品属性
//                                    .food(------可食用
//                                            new FoodProperties.Builder()
//                                                    .nutrition(2)-----饱食度
//                                                    .saturationMod(0.6F)------饱和度
//                                                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1.0f)------食用后的效果，可多次添加
//                                                    .effect(() -> {...})
//                                            .build()
//                                    )
//                    )
//            )
    public static Item.Properties basicItem() {
    return new Item.Properties();
    }
}
