# MythicMate
A D&amp;D Discord bot that facilitates dice rolling and rules referencing. Implements a web scraper to update local database files on the machine I run it on.

## Notice: Missing Class in Files
Discord bots run on tokens, and because of some of the use cases for this bot I have a password set on a specific command. The token for this bot and the password are in a class called "Authenticate" which has not been included in these files.

## Overview
My friends and I play D&amp;D and due to distance we do it remotely via discord. There are some really good discord bots out there but they all felt like they were lacking something. The dice input was really specific in its syntax, the information was locked behind paywalls and account linking, we wanted something quick, easy, and low maintenance. Enter MythicMate.

## Dice Rolling
When you are in the middle of a game, you don't want to have to remember the complex syntax of commands, or worry about a misspelling ruining your flow, you want fast and effective. For the dice rolling commands, MythicMate accepts any length of dice, and displays what each one rolled for dramatic effect. It sorts through your input, splitting it by plus signs, and removing any spaces that might cause issue. If the bot for some reason does not recognize a symbol, it will still roll the dice it does recognize and simply alert you of the error! No more pausing to ask "How do I roll again?"

Currently MythicMate supports rolling flat, rolling with advantadge and disavantadge, rolling for great weapon fighting (rerolling 1's and 2's), and sorcerer empowering (rerolling any dice below a specified number).

## Web Scraping
A lot of D&amp;D content is locked behind a paywall, but there are user ran sites like the DND5eWikiDot, that you can gather the important things from like rules, and spell details. When I run the password locked "/update" command, it searches through the links on the homepage of this wiki, and pulls information from them, saving them as formatted text files on my computer. These files are formatted in Discord's Markdown format. When a user wants to look up something, it references the available text files, and offers autocomplete suggestions. The files are then simply passed into a discord message with no further formatting needed, because it is all taken care of when scraping the data. This results in lightning fast searches.

## Future Plans
I would like for MythicMate to feel like an actual D&amp;D companion, someone who is a part of your server, helping you play the game that you love to play! I am researching conversational AI, and hope to soon be able to add light banter to rolling commands, and present information in a more conversational format to the users.


