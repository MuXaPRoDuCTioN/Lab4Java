public class MyProgram
{
	public static void main (String args[])
	{
		//Проверяем первый класс
		AttackDMG DMG = new AttackDMG();
		DMG.setPlayerDMG(5);
		DMG.setEnemyDFN(3);
		System.out.printf("При уроне игрока %d и защите противника %d он получит %d единицы урона \n", DMG.getPlayerDMG(), DMG.getEnemyDFN(), DMG.FinalDMG());
		System.out.printf("\n");
		
		//Проверяем второй класс
		Defence DFN = new Defence();
		DFN.setDefence(3, 5, 1, 2, 1);
		System.out.printf("При показателях брони: %d, %d, %d, %d, %d общий показатель равен %d \n", DFN.getHelmDefence(), DFN.getCuirDefence(), DFN.getGlovDefence(), DFN.getGreaDefence(), DFN.getBootDefence(), DFN.AllDefence());
		System.out.printf("\n");
		
		//Проверяем третий класс
		Biome Forest = new Biome();
		Forest.CreateBiome();
		System.out.printf("\n");
		
		//Проверяем четвертый класс
		Attributes Player = new Attributes();
		Player.setAttributes(58, 79, 31);
		Player.CheckAttributes();
		System.out.printf("\n");

		//Проверяем пятый класс
		Item MyItem = new Item();
		MyItem.CreateItem();
		System.out.printf("\n");
		
		//Проверяем шестой класс
		Quest MyQuest = new Quest(MyItem);
		MyQuest.CreateQuest();
		System.out.printf("\n");
		
		//Проверяем седьмой класс
		AttackSpell MySpell = new AttackSpell();
		MySpell.CreateAttackSpell();
		System.out.printf("\n");
		
		//Проверяем восьмой класс
		Inventory MyInvent = new Inventory(30);
		MyInvent.setItemsCount(4);

		MyInvent.fillInv();
		MyInvent.showInv();

		MyInvent.CheckInventory();
		System.out.printf("\n");
	}
}