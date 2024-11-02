public class MyProgram
{
	public static void main (String args[])
	{
		//Проверяем первый класс
		AttackDMG DMG = new AttackDMG();
		DMG.setPlayerDMG(5);
		DMG.setEnemyDFN(3);
		System.out.printf("При уроне игрока %d и защите противника %d он получит %d единицы урона \n", DMG.getPlayerDMG(), DMG.getEnemyDFN(), DMG.FinalDMG());
		
		//Проверяем второй класс
		Defence DFN = new Defence();
		DFN.setDefence(3, 5, 1, 2, 1);
		System.out.printf("При показателях брони: %d, %d, %d, %d, %d общий показатель равен %d \n", DFN.getHelmDefence(), DFN.getCuirDefence(), DFN.getGlovDefence(), DFN.getGreaDefence(), DFN.getBootDefence(), DFN.AllDefence());
		
		//Проверяем третий класс
		Biome Forest = new Biome();
		Forest.CreateBiome();
		
		//Проверяем четвертый класс
		Attributes Player = new Attributes();
		Player.setAttributes(58, 79, 31);
		Player.CheckAttributes();	

		//Проверяем пятый класс
		Item MyItem = new Item();
		MyItem.CreateItem();
		
		//Проверяем шестой класс
		Quest MyQuest = new Quest(MyItem);
		MyQuest.CreateQuest();
		
		//Проверяем седьмой класс
		AttackSpell MySpell = new AttackSpell();
		MySpell.CreateAttackSpell();
		
		//Проверяем восьмой класс
		Inventory MyInvent = new Inventory(30);
		MyInvent.setItemsCount(4);

		MyInvent.fillInv();
		MyInvent.showInv();

		MyInvent.CheckInventory();
	}
}