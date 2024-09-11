# First Minecraft Mod
- [ ] Redstone 2.0
- [ ] Electricity
- [ ] Machines - zo


## Notes
### Adding items
- Register Item (ModItems.java)
- Add registered item to desired game mode (TutorialMod.java)
- Add translation (en_us.json)
- Point to your texture / item (alexandrite.json)
### Adding blocks
- Register Block (ModBlocks.java)
- Add registered item to desired creative tab (TutorialMod.java)
- Add (alexandrite_block.Json) to Blockstates to point it to the block model
- Add (alexandrite_block.Json) to Block to point it to the texture
- Add (alexandrite_block.Json) to item so you can add the item to the inventory menu
### Create custom tab
- Create custom Class in Item package
- Register the newly created Class
  - Add it to list of registered entities
  - Complete registry using registry()
- Call register() in TutorialMod Class
- Add the tab to the game in the newly created Class
- Add translation to en_us.json file