README for Project Escape

**IMPORTANT NOTICE**
So we didn't have time to error check input. For that reason, the program can stop working
in certain situations and produce wrong output and mess it all up. If we had more time
we would have implemented such error checking and even output messages regarding user
input. For this reason it is REQUIRED that you type everything correctly and it is also
REQUIRED to match all the items correctly. **PLEASE** refer to the list below to make sure
the combine button does not produce Error 2. We know this does not let the player fully 
figure out the combinations themselves but we have to run with it because lack of time.
**IMPORTANT NOTICE**

**ERRORS THAT CAN HAPPEN IN THE GAME**
1. If you input an item name for pick up that is currently not in the room or if you input an
   item name for dropping that is currently not in your inventory. Name must match exactly 
   or else this error will occur.
       -This will cause a default Item object to be created and be place in your inventory 
        (Pick Up) or be placed in the current room (drop). If this occurs, the game is 
        still not dead but this is obviously not wanted behaviour caused by having no error
        checking.
2. If you combine 2 items that don't match or if you combine 1 item with a wrong item name.
       -This will cause any of the items written correctly to be removed from your
        inventory. This straight up deletes them and are no longer available to the player.
        And will require a reset of the game. Please use the list below to ensure this does not
        occur. 
**ERRORS THAT CAN HAPPEN IN THE GAME**

HOW TOP PLAY THE GAME 
- You first run the application via the Main.java and begin the game.
- The goal of the game is simple, unlock a key hidden in each room. Pick up the keys and 
  unlock the locks in the door to escape.
- You will go through each room, checking each room and looking at the item in it
	(You display the items by clicking the "Display Current Inventory" button)
- After collecting items that can create a reaction you will input them in the boxes
  around the + sign to "combine" them. Once in the boxes you press the "Combine" button to 
  unlock the key hidden in a room. 
- To obtain the key you go into the room where it spawned and pick it up.
- Once you have a key you can head to the door room and click the designated button to remove
  the lock. Pressing the wrong key button will not have any effect.
- Once the player has unlocked all 4 locks, the player can press the green "scape" button
  to end the game.

***LIST OF AVAILABLE COMBINE OPTIONS***
(You can write hammer + vase or vase + hammer)
vase + hammer = key in room 1
box + scissors = key in room 2
safePassword + safe = key in room 3
square + square shaped hole = key in room 4
***LIST OF AVAILABLE COMBINE OPTIONS***


