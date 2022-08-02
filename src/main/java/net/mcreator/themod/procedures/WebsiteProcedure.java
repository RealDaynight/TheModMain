package net.mcreator.themod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class WebsiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"tellraw @p [\"\",{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"<>\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"<\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\">\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"<>\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"\\n \"},{\"text\":\" Our Website:\",\"color\":\"green\"},{\"text\":\"\\n \"},{\"text\":\"sapphiremc.xyz\",\"color\":\"yellow\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://sapphiremc.xyz/\"}},{\"text\":\"\\n\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"<>\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"<\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\">\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"<>\",\"color\":\"aqua\"},{\"text\":\"-\",\"color\":\"gold\"},{\"text\":\"-\",\"color\":\"dark_green\"},{\"text\":\"-\",\"color\":\"gold\"}]");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.MASTER, 10, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
						SoundSource.MASTER, 10, 1, false);
			}
		}
	}
}
