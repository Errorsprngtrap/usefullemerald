package net.spring.usefullemerald.items;

import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;
import net.spring.usefullemerald.util.ModTags;

public class ModToolMaterial {
    public static final ToolMaterial EMERALD = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            200,
            6f,
            1.5f,
            30,
            Tags.Items.GEMS_EMERALD
    );
}
