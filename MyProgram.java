import java.util.Scanner;
import java.util.*;

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
		
		List<Item> Invent = new ArrayList<>();
		
		Invent.add(MyItem);
		Invent.add(clonedMyItem);
		
		// Вывод исходного списка
        System.out.println("Исходный список предметов:");
        printItems(Invent);
		
		// Сортировка по цене
        Collections.sort(Invent);
        System.out.println("\nСписок после сортировки по цене:");
        printItems(Invent);
		
		// Найдем предметы дороже 50
        List<Item> expensiveItems = findItemsAbovePrice(Invent, 50);
        System.out.println("\nПредметы дороже 50 монет:");
        printItems(expensiveItems);
	}
	
	// Метод для вывода списка транспортных средств
    private static void printItems(List<Item> Invent) {
        for (Item item : Invent) {
            System.out.println(item);
        }
    }
	
	// Метод поиска предметов дороже указанной цены
    private static List<Item> findItemsAbovePrice(List<Item> items, int Value) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getValue() > Value) {
                result.add(item);
            }
        }
        return result;
    }
}