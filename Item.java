import java.util.Scanner;

//Абстрактный класс
public abstract class Item
{
	protected String Name;        // название предмета
	protected String ItemType;   // тип предмета (оружие, броня, зелье и т.д.)
	protected int Value;            // стоимость предмета
	protected int Weight;           // вес предмета
	
	public Item()
    {
        Value = 0;
        Weight = 0;
    }
	
	public Item(String Name, String ItemType, int Value, int Weight)
	{
		this.Name = Name;
		this.ItemType = ItemType;
		this.Value = Value;
		this.Weight = Weight;
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

		System.out.printf("Вы успешно создали предмет!\n");
	}
	
	//Абстрактный метод
	public abstract void CompareItem();
}

//Интерфейс для просмотра предмета
interface CheckingItem
{
	void CheckItem();
}