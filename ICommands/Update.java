package ICommands;

import ICommandsHelpers.UpdateCommand;
import Events.ICommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.io.IOException;
import java.util.*;

public class Update implements ICommand {
    private final String name = "update";
    private final String description = "Updates database files - For admin use only!";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<OptionData> getOptions() {
        List<OptionData> optionData = new ArrayList<>();
        optionData.add(new OptionData(OptionType.STRING, "database",
                "The database you would like to update.", true)
                .addChoice("Spells", "spell")
                .addChoice("Feats", "feat")
                .addChoice("Lineages", "lineage")
                .addChoice("Classes", "class")
                .addChoice("Subclasses", "subclass"));
        optionData.add(new OptionData(OptionType.STRING, "password",
                "The admin password.", true));

        return optionData;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        try{
            UpdateCommand.update(event);
        }catch(IOException e){
            event.reply(e.getMessage()).queue();
        }
    }
}
