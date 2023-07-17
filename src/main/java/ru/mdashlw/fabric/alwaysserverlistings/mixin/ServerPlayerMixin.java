package ru.mdashlw.fabric.alwaysserverlistings.mixin;

import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

  /**
   * @author
   * @reason
   */
  @Overwrite
  public boolean allowsListing() {
    return true;
  }
}
