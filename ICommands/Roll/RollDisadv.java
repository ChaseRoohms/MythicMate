package ICommands.Roll;

import ICommandsHelpers.RollCommand;
import Events.ICommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.ArrayList;
import java.util.List;

public class RollDisadv implements ICommand {
    private final String name = "rolldisadv";
    private final String description = "Roll twice, drop the higher roll!";


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
        optionData.add(new OptionData(OptionType.STRING, "dice",
                "The dice you want to roll", true));
        return optionData;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        RollCommand.roll(event, RollCommand.RollType.DISADV);
    }
}
