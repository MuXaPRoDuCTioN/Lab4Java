import java.util.Scanner;

public class MyProgram
{
	public static void main (String args[]) throws CloneNotSupportedException
	{
		Scanner in = new Scanner(System.in, "Cp866");
		
		//Проверяем первый класс
		AttackDMG DMG = new AttackDMG();
		DMG.setPlayerDMG(5);
		DMG.setEnemyDFN(3);
		System.out.printf("При уроне игрока %d и защите противника %d он получит %d единицы урона \n", DMG.getPlayerDMG(), DMG.getEnemyDFN(), DMG.FinalDMG());
		System.out.printf("\n");
		
		//Проверяем второй класс
		Defence DFN = new Defence();
		DFN.setDefence(3, 5, 1, 2, 1);
		Calculator.processDefence(DFN.getEquipDefence(), DFN);
		System.out.printf("При показателях брони: %d, %d, %d, %d, %d общий показатель равен %d \n", DFN.getEquipDefence()[0], DFN.getEquipDefence()[1], DFN.getEquipDefence()[2], DFN.getEquipDefence()[3], DFN.getEquipDefence()[4], DFN.getAllDefence());
		System.out.printf("\n");
		
		//Проверяем третий класс
		Biome Forest = new Biome();
		Forest.CreateBiome();
		System.out.printf("\n");
		
		//Проверяем четвертый класс
		Attributes Player = new Attributes();
		int STR = 1, INT = 1, AGL = 1;
		char userResponse;
		
		do {
			System.out.printf("Введите значение силы: ");
			STR = in.nextInt();
			
			System.out.printf("Введите значение интеллекта: ");
			INT = in.nextInt();
			
			System.out.printf("Введите значение ловкости: ");
			AGL = in.nextInt();
			
			//Проверка ввода
			try {
				Player.setAttributes(STR, INT, AGL);				
				Player.CheckAttributes();
			} catch (InvalidAttributesException e) {
				System.out.println("Неверно введен атрибут: " + e.getMessage());
			}			
			
			System.out.printf("Хотите повторить? (д/н): ");
            userResponse = in.next().toLowerCase().charAt(0);
			System.out.printf("\n");
		} while (userResponse == 'д');
				
		System.out.println("Всего корректных вводов: " + Attributes.getTotalInputCounting());
		System.out.printf("\n");

		//Проверяем пятый класс
		Usable MyItem = new Usable();
		MyItem.CreateItem();
		Usable clonedMyItem = (Usable) MyItem.clone();
		clonedMyItem.CheckItem();
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