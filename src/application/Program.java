package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion championOponnetFirst = new Champion();
		Champion championOponnetSecond = new Champion();

		System.out.print("Digite os dados do primeiro campeão: ");
		// sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Vida Inicial: ");
		int life = sc.nextInt();

		System.out.print("Ataque :");
		int attack = sc.nextInt();
		int attackOponentFirst = attack;
		System.out.print("Armadura :");
		int armor = sc.nextInt();

		int damange = 0;

		championOponnetFirst.Champion(name, life, damange, attack, armor);

		System.out.print("Digite os dados do segundo campeão: ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.print("Vida Inicial: ");
		life = sc.nextInt();

		System.out.print("Ataque :");
		attack = sc.nextInt();
		int attackOponentSecond = attack;

		System.out.print("Armadura :");
		armor = sc.nextInt();

		championOponnetSecond.Champion(name, life, damange, attack, armor);

		System.out.print("Quantidade Round: ");
		int round = sc.nextInt();

		int i = 0;
		while (i < round && (championOponnetFirst.getLife() > 0 && championOponnetSecond.getLife() > 0)) {
			int x = i + 1;
			System.out.println("Resultado do turno:" + x);

			championOponnetFirst.takeDamange(championOponnetFirst.getName(), championOponnetFirst.getLife(), damange,
					attackOponentSecond, championOponnetFirst.getArmor());

			championOponnetSecond.takeDamange(championOponnetSecond.getName(), championOponnetSecond.getLife(), damange,
					attackOponentFirst, championOponnetSecond.getArmor());

			System.out.println("Nome Oponente 1 "
					+ championOponnetFirst.status(championOponnetFirst.getName() + "  " , championOponnetFirst.getLife()));
			System.out.println("Nome Oponente 2 "
					+ championOponnetSecond.status(championOponnetSecond.getName() + " " , championOponnetSecond.getLife()));

			championOponnetFirst.getLife();
			championOponnetSecond.getLife();

			i++;

			System.out.println("FIM DO  COMBATE");

		}
	}

}
