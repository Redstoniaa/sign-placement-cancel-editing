# Fabric Template Mod
This is just an unofficial Fabric template mod you can use for your own needs! This is just a fork of the official [fabric-example-mod](https://github.com/FabricMC/fabric-example-mod) provided by the FabricMC team.

### Changes in this template:
 - Uses the [Quiltflower](https://github.com/QuiltMC/quiltflower) decompiler by the QuiltMC team, which is greatly improved over the FernFlower decompiler that Fabric normally uses.

## Setup
For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using. In addition, you'll also want to take a look at the following files to set up. You'll want to also replace all instances of "template" with your own mod id.

### `fabric.mod.json`
This is where a lot of the mod's information is contained, like the mod id, name, description, the versions it works on, etc. Simply edit everything to be relevant to your own mod. You may wish to read [this](https://fabricmc.net/wiki/documentation:fabric_mod_json) and [this](https://fabricmc.net/wiki/documentation:fabric_mod_json_spec) if you need more specific details how the file is structured.

### `template.mixins.json`
This is where you define mixins that the mod uses. If you don't plan to use mixins, just delete it and the reference to it in `fabric.mod.json`.

### `build.gradle`
You probably won't need to go into `build.gradle` unless you need another mod to use as a dependency, or if you're doing smart people Loom magic.

### `gradle.properties`
Update the properties and dependencies as required. After that, edit the mod properties to your needs.

### `TemplateMod.java`
This is the main entrypoint for your mod. You'll want to change the `MOD_ID` to your own mod's id, and any code that you want to use when the mod is loaded can go into `onInitialize()`.

### `LICENSE`
This is the licensing that your mod will use. It's important to change this from CC0 to whatever license you want to use or else everyone is free to take your code without a second thought. You can easily choose a license through GitHub's nice and dandy `Choose a license template` button, which you can see when you edit the file on the GitHub site. You should also now edit the `license` in your `fabric.mod.json` to match this.

### `README.md`
You'll want to empty out this file after you're done with the instructions, because I doubt you want to distribute your mod with a readme shouting to everyone that "this is a Fabric Template Mod!"

## License
This template is available under the CC0 license. This means this template can actually server its purpose as a... well... a _template! This means you can use this for yourself without worrying about being sued by MEEEE!_ Because _obviously_ I'm the type of person to sue you in court.
