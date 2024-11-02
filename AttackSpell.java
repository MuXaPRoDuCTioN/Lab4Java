import java.util.Scanner;

public class AttackSpell
{
	private String Name;       //название заклинания
	private int Damage;          //урон заклинания
	private int Radius;          //радиус взрыва заклинания
	private int Element;           //стихия заклинания (0 - огонь, 1 - лед, 2 - электричество)
	
	AttackSpell()     //Конструктор
    {
        Damage = 0;
        Radius = 0;
        Element = 0;
    }
	
	//Методы получения значений
    public String getName() 
    {
        return Name;
    }

    public int getDamage() 
    {
        return Damage;
    }

    public int getRadius() 
    {
        return Radius;
    }

    public int getElement() 
    {
        return Element;
    }

    //Метод создания атакующего заклинаиния
    public void CreateAttackSpell()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Введите название заклинания: ");
		Name = in.nextLine();

		System.out.printf("Введите Урон: ");
			Damage = in.nextInt();
			
		System.out.printf("Введите Радиус взрыва: ");
			Radius = in.nextInt();

		do {
			System.out.printf("Введите Стихию заклинания (0-2): ");
			Element = in.nextInt();
		} while (Element < 0 || Element > 2);

		System.out.printf("Вы успешно создали заклинание!\n");
	}
}