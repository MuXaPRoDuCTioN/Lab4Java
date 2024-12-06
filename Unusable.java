import java.util.Scanner;

//Еще один производный класс с клонированием
public class Unusable extends Item implements CheckingItem, Cloneable
{
	private boolean isQuestItem;  //Является ли предмет квестовым
	
	//Конструктор с вызовом конструктора базового класса
	public Unusable() 
	{
		super();
		isQuestItem = false;
	}
	
	//Перегрузка метода без вызова родительского метода
	@Override
	public void CreateItem()
	{
		Scanner in = new Scanner(System.in, "Cp866");
		System.out.printf("Введите название предмета: ");
		Name = in.nextLine();

		System.out.printf("Введите тип предмета: ");
		ItemType = in.nextLine();

		System.out.printf("Введите цену предмета: ");
		Value = in.nextInt();
		System.out.printf("Введите вес предмета: ");
		Weight = in.nextInt();
		
		System.out.printf("Это квестовый предмет?: ");
		isQuestItem = in.nextBoolean();

		System.out.printf("Вы успешно создали предмет!\n");
	}
	
	//Реализация метода интерфейса
	@Override
	public void CheckItem()
	{
		if (isQuestItem)
			System.out.println("Этот предмет нужен для задания");
		else
			System.out.println("Это обычный предмет");
	}
	
	//Метод для глубокого клонирования
	public Unusable deepClone()
	{
		return new Unusable(this.Name, this.ItemType, this.Value, this.Weight, this.isQuestItem);
	}
	
	//Метод для получения значения
	@Override
	public int getisQuestItem()
	{
		return isQuestItem;
	}
}