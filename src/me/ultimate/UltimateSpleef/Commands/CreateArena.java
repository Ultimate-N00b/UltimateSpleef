package me.ultimate.UltimateSpleef.Commands;

import org.bukkit.entity.Player;

public class CreateArena implements BaseCommand {

    @Override
    public void perform(Player p, String args) {
        
    }

    @Override
    public String getCommand() {
        return "createarena";
    }

    @Override
    public int getLength() {
        return 1;
    }

    @Override
    public String getPermission() {
        return "ultimatespleef.admin";
    }

}
