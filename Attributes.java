public class Attributes
{
	private int Strength;          //показатель силы
	private int Intelligence;       //показатель интеллекта
	private int Agility;            //показатель ловкости
	private static int totalInputCounting;    //показывает, сколько раз вводили данные
	private static final int MIN_ATR = 1;    //минимальная граница
	private static final int MAX_ATR = 100;   //максимальная граница
	
	Attributes()             //Конструктор
    {
        Strength = 1;
        Intelligence = 1;
        Agility = 1;
    }
	
	//Метод установки значений атрибутов
    public void setAttributes(int STR, int INT, int AGL) throws
    InvalidAttributesException {
		try {
			if (STR < MIN_ATR || STR > MAX_ATR)
				throw new InvalidAttributesException("Значение атрибута вне допустимого диапазона: " + STR);
			
			Strength = STR;
		
			if (INT < MIN_ATR || INT > MAX_ATR)
				throw new InvalidAttributesException("Значение атрибута вне допустимого диапазона: " + STR);
		
			Intelligence = INT;

			if (AGL < MIN_ATR || AGL > MAX_ATR)
				throw new InvalidAttributesException("Значение атрибута вне допустимого диапазона: " + STR);
		
			Agility = AGL;
		
			totalInputCounting++;
		} catch (InvalidAttributesException e) {
			System.out.println("Внимание: " + e.getMessage());
			throw e;
		}
    }
	
	//Метод получения значений атрибутов
    public int getStregth()  
    {
        return Strength;
    }

    public int getIntelligence()  
    {
        return Intelligence;
    }

    public int getAgility()  
    {
        return Agility;
    }

    //Метод проверки атрибутов
    public void CheckAttributes()
	{
		System.out.printf("При показателях Силы, Интеллекта, Ловкости в %d %d %d, ваш персонаж: ", getStregth(), getIntelligence(), getAgility());

		if (Strength > 0 && Strength <= 25)
			System.out.print("Хрупкий, ");
		else if (Strength > 25 && Strength <= 50)
			System.out.print("Слабый, ");
		else if (Strength > 50 && Strength <= 75)
			System.out.print("Крепкий, ");
		else if (Strength > 75 && Strength <= 100)
			System.out.print("Могучий, ");

		if (Intelligence > 0 && Intelligence <= 25)
			System.out.print("Слабоумный, ");
		else if (Intelligence > 25 && Intelligence <= 50)
			System.out.print("Глупый, ");
		else if (Intelligence > 50 && Intelligence <= 75)
			System.out.print("Знающий, ");
		else if (Intelligence > 75 && Intelligence <= 100)
			System.out.print("Умный, ");

		if (Agility > 0 && Agility <= 25)
			System.out.print("Неуклюжий.\n ");
		else if (Agility > 25 && Agility <= 50)
			System.out.print("Неловкий.\n");
		else if (Agility > 50 && Agility <= 75)
			System.out.print("Ловкий.\n");
		else if (Agility > 75 && Agility <= 100)
			System.out.print("Изящный.\n");
	}
	
	//Статический метод для получения статического значения
	public static int getTotalInputCounting()
	{
		return totalInputCounting;
	}
}

class InvalidAttributesException extends Exception
{
	public InvalidAttributesException(String message) 
	{
		super(message);
	}
}