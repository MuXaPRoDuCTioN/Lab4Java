import java.util.Scanner;

public class Biome
{
	private String Name;                 //название биома
	private int RecomendLevel;             //рекомендуемый уровень
	private int MaxMapSize;                //максимальный размер карты
	
	Biome()                  //Конструктор
    {		
        RecomendLevel = 1;
        MaxMapSize = 1;
    }
	
	//Метод создания биома
    public void CreateBiome()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите название биома: ");
		Name = in.nextLine();

		System.out.print("Введите Рекомендуемый уровень: ");
		RecomendLevel = in.nextInt();
		System.out.print("Введите Максимальный размер карты (в кол-ве блоков): ");
		MaxMapSize = in.nextInt();

		System.out.print("Вы успешно создали биом!\n");
	}
	
	//Получение информации о биоме
    public String getName()  
    {
        return Name;
    }

    public int getRecLvl()  
    {
        return RecomendLevel;
    }

    public int getMaxMapSize()  
    {
        return MaxMapSize;
    }
}