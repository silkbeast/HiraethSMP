package net.silkbeast.hiraethsmp.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.silkbeast.hiraethsmp.hiraethsmp;
import net.silkbeast.hiraethsmp.item.advanced.DragonBreathItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(hiraethsmp.MODID);

    public static final DeferredItem<Item> KEY = ITEMS.register("hiraethim_key",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DRAGONBREATHER = ITEMS.register("dragon_breather",
            () -> new DragonBreathItem(new Item.Properties().durability(16).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
