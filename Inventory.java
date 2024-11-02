import java.util.ArrayList;
import java.util.Random;

public class Inventory
{
	private int ItemsCount;        //число вещей в инвентаре
	private int MaxItems;         //максимальное число вещей в инвентаре
	private ArrayList<Integer> Invent;          //здесь будут храниться ID предметов
	
	Inventory(int MaxItems)       //Конструктор
    {
        ItemsCount = 0;
        this.MaxItems = MaxItems;

        Invent = new ArrayList<>(MaxItems);
        for (int i = 0; i < MaxItems; i++)
        {
            Invent.add(0);
        }
    }
	
	//Методы установки значений
    public void setMaxItems(int MaxItems)
    {
        this.MaxItems = MaxItems;
    }

    public void setItemsCount(int ItemsCount)
    {
        this.ItemsCount = ItemsCount;
    }

    //Методы получения значений
    public int getItemsCount() 
    {
        return ItemsCount;
    }

    public int getMaxItems() 
    {
        return MaxItems;
    }

    public void fillInv()
    {
		Random random = new Random();
        for (int i = 0; i < ItemsCount; i++)
        {
            Invent.set(i, random.nextInt(50)+1);
        }
    }

    public void showInv()
    {
        for (Integer num : Invent)
		{
			if (num == 0)
				break;
			System.out.printf("%d ", num);
		}
		System.out.println("\n");
    }

    //Метод проверки инвентаря
    public void CheckInventory()
	{
		System.out.printf("Свободного места в инвентаре: %d\n", MaxItems-ItemsCount);
	}
}