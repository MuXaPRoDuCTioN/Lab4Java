import java.util.Scanner;

public class Item
{
	private String Name;        // название предмета
	private String ItemType;   // тип предмета (оружие, броня, зелье и т.д.)
	private int Value;            // стоимость предмета
	private int Weight;           // вес предмета
	
	Item()
    {
        Value = 0;
        Weight = 0;
    }
	
	//Методы для получения значений предмета
    public String getName()  
    {
        return Name;
    }

    public String getItemType() 
    {
        return ItemType;
    }

    public int getValue() 
    {
        return Value;
    }

    public int getWeight() 
    {
        return Weight;
    }

    //Метод создания предмета
    void CreateItem()
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

		System.out.printf("Вы успешно создали предмет!\n");
	}
}