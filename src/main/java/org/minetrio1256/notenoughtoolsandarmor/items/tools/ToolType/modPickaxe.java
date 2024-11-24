package org.minetrio1256.notenoughtoolsandarmor.items.tools.ToolType;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.List;

public class modPickaxe extends Item {
    TagKey<Block> tagKeyFinal;
    public modPickaxe(Properties pProperties, TagKey<Block> tagKey) {
        super(pProperties);
        tagKeyFinal = tagKey;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if(!level.isClientSide) {
            if (level.getBlockState(pContext.getClickedPos()).is(Blocks.ANDESITE)) {
                level.destroyBlock(pContext.getClickedPos(), true, pContext.getPlayer());

                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level),
                        (ServerPlayer) pContext.getPlayer(), item ->
                                pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            }
        }
        return InteractionResult.CONSUME;
    }

    /*@Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if(!Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.mccourse.chainsaw.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.mccourse.chainsaw.tooltip.1"));
            pTooltipComponents.add(Component.translatable("tooltip.mccourse.chainsaw.tooltip.2"));
        }
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    } */
}
