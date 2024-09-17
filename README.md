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
### Adding custom advanced items
- Create the custom advanced item in custom package
- Register newly created item
### Adding custom advanced blocks]
- Create the custom advanced block in custom package
- Register like a regular block
- edit the properties of the block ex. Magic Block.java
### Adding food and fuel
- Creating custom food properties
  - Create class(ModFoodProperties) in item package
  - Register the custom food item and assets in the ModItem class
  - Add custom food item to custom item tab
  - Register the item by creating its own json file in models/item package
  - Add translation to en-us.json file
  - Add texture png to texture/item package
  - 
