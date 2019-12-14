# Battle-Falcons

Battle Falcons is a card-based strategy game where you play against a computer opponent. The two main resources of the game are health and mana. You start with 2 mana and it increments by 2 each turn. You use mana to play birds onto the field. The birds you play get placed to the leftmost tile on the field. Your birds will fight the opponent’s birds that are placed in front of them. The bird with the higher attack kills the opposing bird. If there is no bird opposing a bird, it will attack the opponent directly and deal damage to the opponent’s health. You start with 30 health and lose when it drops to zero. If the opponent’s health drops to zero before yours, you win. 

The game’s full collection of playable cards is stored in an array of card objects. When the game starts running, these cards are shuffled randomly and pushed onto two separate stacks that become the player’s and enemy’s decks. Each turn, the player draws from his deck and the top card is popped from the stack. This card is added to a linked list that serves as the player’s hand. When the player plays a card, it is removed from his hand’s linked list and added to another linked list that represents the playing field. When you remove a card from the linked list, all the cards will automatically be placed in their proper positions.


![Screen Shot 2019-12-13 at 6 18 33 PM](https://user-images.githubusercontent.com/54300496/70842154-06f23e80-1dd5-11ea-8d27-8f563606e450.png)
