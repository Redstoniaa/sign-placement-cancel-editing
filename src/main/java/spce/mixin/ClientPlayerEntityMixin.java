package spce.mixin;

import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static spce.SignPlacementCancelEditingMod.*;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin {
    @Inject(method = "openEditSignScreen",
            at = @At("HEAD"),
            cancellable = true)
    private void cancelIfPlaced(SignBlockEntity sign, boolean fromFront, CallbackInfo ci) {
        if (lastActionResult == ActionResult.SUCCESS) {
            // Last action result indicated that a sign was placed.
            ci.cancel();
    
            if (isDevEnvironment()) {
                LOGGER.info("Sign edit cancelled!");
            }
        }
    }
}
