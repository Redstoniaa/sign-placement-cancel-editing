package nsigui.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SignItem.class)
public class SignItemMixin {
    @Inject(method = "postPlacement",
            at = @At(value = "INVOKE",
                     target = "Lnet/minecraft/item/WallStandingBlockItem;postPlacement(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;)Z",
                     shift = At.Shift.AFTER),
            cancellable = true)
    private void returnBeforeGui(BlockPos pos, World world, PlayerEntity player, ItemStack stack, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(cir.getReturnValue());
    }
}
