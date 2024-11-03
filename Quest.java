import java.util.Scanner;

public class Quest
{
	private String Title;      // название задания
	private String Description; // описание задания
	private Item Reward;       //Награда за выполнение задания
	private boolean IsCompleted;     // статус выполнения (0 - не выполнено, 1 - выполнено)
	
	Quest(Item item)      //Конструктор
    {
        IsCompleted = false;

        Reward = item;
    }
	
	//Методы для получения значений задания
    public String getTitle()  
    {
        return Title;
    }

    public String getDescription() 
    {
        return Description;
    }

    public boolean getComplited() 
    {
        return IsCompleted;
    }

    //Метод для создания задания
    public void CreateQuest()
	{
		Scanner in = new Scanner(System.in, "Cp866");
		System.out.printf("Введите название задания: ");
		Title = in.nextLine();

		System.out.printf("Введите описание задания: ");
		Description = in.nextLine();

		System.out.printf("Предмет в награду за задание: %s \n", Reward.getName());

		IsCompleted = false;

		System.out.printf("Вы успешно создали задание!\n");
	}
}