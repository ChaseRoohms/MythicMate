package ICommands;

import Database.RulesDatabase;
import Events.ICommand;
import Functions.MessageSender;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conditions implements ICommand {
    private final String name = "conditions";
    private final String description = "View the conditions of DND5e.";
    private List<OptionData> optionData = new ArrayList<>();


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
        return optionData;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        event.replyEmbeds(RulesDatabase.getConditionEmbed().build()).setEphemeral(true).queue();
    }
}
