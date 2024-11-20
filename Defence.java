public class Defence
{
	private int[] EquipDefence;         //Список с показателем защиты каждого предмета
	private int AllDefence;				//полный показатель защиты
	private int TopDefence;				//показатель защиты верхней части тела
	private int BottomDefence;				//показатель защиты нижней части тела

	Defence()  //Конструктор
	{
		EquipDefence = new int[5];
	}
	
	//Метод установки значений защиты извне
    public void setDefence(int Helm, int Cuir, int Glov, int Grea, int Boot)
    {
		EquipDefence[0] = Helm; //0 - Шлем
        EquipDefence[1] = Cuir; //1 - Кирасса
        EquipDefence[2] = Glov; //2 - Перчатки
        EquipDefence[3] = Grea; //3 - Поножи
        EquipDefence[4] = Boot; //4 - Ботинки
    }
	
	//Методы получения значений урона и защиты извне
    public int[] getEquipDefence()
	{
		return EquipDefence;
	}
	
	public int getAllDefence() 
    {
        return AllDefence;
    }
	
	public int getTopDefence() 
    {
        return TopDefence;
    }
	
	public int getBottomDefence() 
    {
        return BottomDefence;
    }
	
	//Методы установки значений (сеттеры)
	public void setAllDefence(int AllDefence) 
    {
        this.AllDefence = AllDefence;
    }
	
	public void setTopDefence(int TopDefence) 
    {
        this.TopDefence = TopDefence;
    }
	
	public void setBottomDefence(int BottomDefence) 
    {
        this.BottomDefence = BottomDefence;
    }
}

//Вспомогательный класс
class Calculator 
{
	public static void processDefence(int[] EquipDefence, Defence Equip)
	{
		int AllDefence = 0;
		int TopDefence = 0;
		int BottomDefence = 0;
		
		for (int i = 0; i < 5; i++)
		{
			AllDefence += EquipDefence[i];
			
			if (i < 3)
				TopDefence += EquipDefence[i];
			else
				BottomDefence += EquipDefence[i];
		}
		
		Equip.setAllDefence(AllDefence);
		Equip.setTopDefence(TopDefence);
		Equip.setBottomDefence(BottomDefence);
	}
}