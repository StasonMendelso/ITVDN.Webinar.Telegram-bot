package com.example.demobot.bot.commands;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.IBotCommand;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.bots.AbsSender;

/**
 * @author Stanislav Hlova
 */
public abstract class BaseTextCommand implements IBotCommand {
  private final String textCommandIdentifier;

  public BaseTextCommand(String textCommandIdentifier, String description) {
    this.textCommandIdentifier = textCommandIdentifier;
    this.description = description;
  }

  private final String description;

  @Override
  public String getCommandIdentifier() {
    return textCommandIdentifier;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void processMessage(AbsSender absSender, Message message, String[] strings) {

  }
}
