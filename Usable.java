import java.util.Scanner;

//Производный класс с клонированием
public class Usable extends Item implements CheckingItem, Cloneable
{
	private int Target;  //0 - на себя, 1 - на цель, 2 - на место
	private int Effect;  //0 - положительный, 1 - отрицательный, 2 - нейтральный
	
	//Конструктор с вызовом конструктора базового класса
	public Usable()
	{
		super();
		Target = 0;
		Effect = 0;
	}
	
	//Перегрузка метода базового класса
	@Override
	public void CreateItem()
	{
		super.CreateItem();
		Scanner in = new Scanner(System.in, "Cp866");
		while (Target >= 0 && Target <= 2 && Effect >= 0 && Effect <= 2)
		{
			System.out.printf("Введите цель предмета (0, 1, 2): ");
			Target = in.nextInt();
			System.out.printf("Введите эффект предмета (0, 1, 2): ");
			Effect = in.nextInt();
		}
	}
	
	//Реализация метода интерфейса
	@Override
	public void CheckItem()
	{
		if (Value > Weight)
			System.out.println("Цена предмета больше веса, можно и поносить с собой");
		else
			System.out.println("Цена предмета меньше веса, лучше выбросить предмет");
	}
	
	//Метод мелкого клонирования
	@Override
    public Object clone() throws CloneNotSupportedException 
	{
        return super.clone();
    }
	
	//Реализация абстрактного метода
	@Override
	public void CompareItem()
	{
		if (this.getValue() >= 100)
			System.out.println("Это ценный предмет");
		else if (this.getValue() >= 10 && this.getValue() < 100)
			System.out.println("Это не очень ценный предмет");
		else
			System.out.println("Этот предмет не имеет ценности");
	}
	
	//Методы для получения значений предмета
	public int getTarget()
	{
		return Target;
	}
	
	public int getEffect()
	{
		return Effect;
	}
}