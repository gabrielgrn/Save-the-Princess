import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class pi {

	static int pontosnece = 35, darioPower = 3, muigiPower = 2, persona;

	static int menu(){

		
		System.out.println("┌------------------- PROJETO  INTEGRADOR --------------------┐");
		System.out.println("| ┌-----------------( SAVE THE PRINCESS )------------------┐ |");
		System.out.println("| |                    -MENU PRINCIPAL-                    | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        JOGAR     [1]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        HISTÓRIA  [2]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        REGRAS    [3]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        CRÉDITOS  [4]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        VOLTAR    [5]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| |        SAIR      [0]                                   | |");
		System.out.println("| |                                                        | |");
		System.out.println("| └--------------------------------------------------------┘ |");
		System.out.println("└------------------------------------------------------------┘");
		System.out.print("RESPOSTA: ");

		return(new Scanner(System.in).nextInt());
	}

	
// PERGUNTA 1
	
	
	static int pergunta1(int jogador){
		int tentativas = 3;

		boolean acertou = false;
		// /Começo do jogo (menu)

		List alternativas = new ArrayList();
		alternativas.add("10"); //correta
		alternativas.add("0");
		alternativas.add("20");
		alternativas.add("30");
		alternativas.add("40");

		System.out.println("Bem vindo(a) a Floresta Sephira, meu nome é Gofin e eu sou o primeiro Elfo de sua jornada para salvar a Princesa Anitta. ");
		System.out.println("Vejo que você possui um poder especial e está pronto o suficiente para chegar ao topo do castelo, vamos a sua primeira pergunta... ");
		System.out.println("Você tem 3 tentativas e lembre-se que possui a habilidade especial!! ");
		System.out.println("");
		System.out.println("┌----------┐");
		System.out.println("|Pergunta 1|");
		System.out.println("└----------┘");
		
		do {
			Collections.shuffle(alternativas);
			
			System.out.println("\n\tTentativa " + (4 - tentativas));
			System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
			System.out.println("\n\nEm um colégio, de 100 alunos, 80 gostam de sorvete de chocolate, 70 gostam de sorvete de creme e 60 gostam dos dois sabores.");
			System.out.println(" Quantos alunos não gostam de nenhum dos dois sabores?");

			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));

			System.out.print("Digite a alternativa correta: ");

			String resposta = new Scanner(System.in).next();

			switch (resposta) {
				case "a":
				case "A":
					if (alternativas.get(0).equals("10")) {
						System.out.println("┌-----------------┐");
						System.out.println("|Resposta correta!|");
						System.out.println("└-----------------┘");
						acertou = true;
					} else {
						System.out.println("┌-------------------┐");
						System.out.println("|Resposta incorreta!|");
						System.out.println("└-------------------┘");
						tentativas -= 1;
					}
					break;
				case "b":
				case "B":
					if (alternativas.get(1).equals("10")) {
						System.out.println("┌-----------------┐");
						System.out.println("|Resposta correta!|");
						System.out.println("└-----------------┘");
						acertou = true;
					} else {
						System.out.println("┌-------------------┐");
						System.out.println("|Resposta incorreta!|");
						System.out.println("└-------------------┘");
						tentativas -= 1;
					}
					break;
				case "c":
				case "C":
					if (alternativas.get(2).equals("10")) {
						System.out.println("┌-----------------┐");
						System.out.println("|Resposta correta!|");
						System.out.println("└-----------------┘");
						acertou = true;
					} else {
						System.out.println("┌-------------------┐");
						System.out.println("|Resposta incorreta!|");
						System.out.println("└-------------------┘");
						tentativas -= 1;
					}
					break;
				case "d":
				case "D":
					if (alternativas.get(3).equals("10")) {
						System.out.println("┌-----------------┐");
						System.out.println("|Resposta correta!|");
						System.out.println("└-----------------┘");
						acertou = true;
					} else {
						System.out.println("┌-------------------┐");
						System.out.println("|Resposta incorreta!|");
						System.out.println("└-------------------┘");
						tentativas -= 1;
					}
					break;
				case "e":
				case "E":

					if (alternativas.get(4).equals("10")) {
						System.out.println("┌-----------------┐");
						System.out.println("|Resposta correta!|");
						System.out.println("└-----------------┘");
						acertou = true;
					} else {
						System.out.println("┌-------------------┐");
						System.out.println("|Resposta incorreta!|");
						System.out.println("└-------------------┘");
						tentativas -= 1;
					}
						break;
				case "P":
				case "p":
					if (jogador == 97 && muigiPower == 2){
						muigiPower = 0;
						if (pergunta1power()) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					}	
					
					
// HABILIDADE ESPECIAL DARIO
					
					
					if(jogador == 54 && darioPower == 3){
						darioPower = 0;
						return pergunta1(54);
					}
				default:
					System.out.println("Escolha inválida!");
				}
				
			
			} while (!acertou && tentativas > 0);

		
		switch(tentativas){
			case 3:
				return 10;
			case 2:
				if(darioPower == 0)
					return 10;
			case 1:
				return 5;
			default:
				return -1;
		}

	}
	

// SE A HABILIDADE ESPECIAL DO MUIGI FOR USADA
	
	
	static boolean pergunta1power(){
		List alternativas = new ArrayList();
		alternativas.add("10"); //correta
		alternativas.add("0");
		alternativas.add("20");

		Collections.shuffle(alternativas);

		System.out.println("\n\nEm um colégio, de 100 alunos, 80 gostam de sorvete de chocolate, 70 gostam de sorvete de creme e 60 gostam dos dois sabores.");
		System.out.println(" Quantos alunos não gostam de nenhum dos dois sabores?");

		System.out.println("a) " + alternativas.get(0));
		System.out.println("b) " + alternativas.get(1));
		System.out.println("c) " + alternativas.get(2));

		System.out.print("Digite a alternativa correta: ");

		String resposta = new Scanner(System.in).next();

		switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("10")) {
					return true;
				} else {
					return false;
				}
			case "b":
			case "B":
				if (alternativas.get(1).equals("10")) {
					return true;
				} else {
					return false;
				}
			case "c":
			case "C":
				if (alternativas.get(2).equals("10")) {
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Escolha inválida!");
				return pergunta1power();
			}	
	}
	
	
	

	// PERGUNTA 2
	
	
	
	static int pergunta2(int jogador){
		int tentativas = 3;

		boolean acertou = false;

			List alternativas2 = new ArrayList();
			alternativas2.add("{4,5,6,7,8}"); // resposta correta
			alternativas2.add("{2,3,4}");
			alternativas2.add("{5}");
			alternativas2.add("{1, 4, 5, 7, 8}");
			alternativas2.add("{5,7,8}");

			System.out.println("Olá aventureiro, vejo que conseguiu passar pelo primeiro nível, meu nome é Hunter e eu sou o segundo Elfo de sua jornada para salvar a Princesa Anitta. ");
			System.out.println("Vamos a sua segunda pergunta..");
			System.out.println("Você tem 3 tentativas !! ");
			System.out.println("");
			System.out.println("┌----------┐");
			System.out.println("|Pergunta 2|");
			System.out.println("└----------┘");
			
			do {
				Collections.shuffle(alternativas2);
				
				System.out.println("\n\tTentativa " + (4 - tentativas));
				System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
				System.out.println("\n\n\"Considerando que A U B = {1, 2, 3, 4, 5, 6, 7, 8}, A ∩ B = {4, 5} e A – B = {1, 2, 3}, qual alternativa representa o conjunto B?");

				System.out.println("a) " + alternativas2.get(0));
				System.out.println("b) " + alternativas2.get(1));
				System.out.println("c) " + alternativas2.get(2));
				System.out.println("d) " + alternativas2.get(3));
				System.out.println("e) " + alternativas2.get(4));

				System.out.print("Digite a alternativa correta: ");

				String resposta = new Scanner(System.in).next();

				switch (resposta) {
					case "a":
					case "A":
						if (alternativas2.get(0).equals("{4,5,6,7,8}")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "b":
					case "B":
						if (alternativas2.get(1).equals("{4,5,6,7,8}")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "c":
					case "C":
						if (alternativas2.get(2).equals("{4,5,6,7,8}")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "d":
					case "D":
						if (alternativas2.get(3).equals("{4,5,6,7,8}")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "e":
					case "E":
						if (alternativas2.get(4).equals("{4,5,6,7,8}")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "P":
					case "p":
					if (jogador == 97 && muigiPower == 2){
						muigiPower = 0;
						if (pergunta2power()) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					}	
					if(jogador == 54 && darioPower == 3){
						darioPower = 0;
						return pergunta2(54);
					}
					default:
						System.out.println("******Escolha inválida!******");
					}
								
			} while (!acertou && tentativas > 0);

			switch(tentativas){
				case 3:
					return 10;
				case 2:
					if(darioPower == 0)
						return 10;
				case 1:
					return 5;
				default:
					return -1;
			}
	}
	
	static boolean pergunta2power(){
		List alternativas = new ArrayList();
		alternativas.add("{4,5,6,7,8}"); //correta
		alternativas.add("{5}");
		alternativas.add("{5,7,8}");

		Collections.shuffle(alternativas);

		System.out.println("\n\n\"Considerando que A U B = {1, 2, 3, 4, 5, 6, 7, 8}, A ∩ B = {4, 5} e A – B = {1, 2, 3}, qual alternativa representa o conjunto B?");

		System.out.println("a) " + alternativas.get(0));
		System.out.println("b) " + alternativas.get(1));
		System.out.println("c) " + alternativas.get(2));

		System.out.print("Digite a alternativa correta: ");

		String resposta = new Scanner(System.in).next();

		switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("{4,5,6,7,8}")) {
					return true;
				} else {
					return false;
				}
			case "b":
			case "B":
				if (alternativas.get(1).equals("{4,5,6,7,8}")) {
					return true;
				} else {
					return false;
				}
			case "c":
			case "C":
				if (alternativas.get(2).equals("{4,5,6,7,8}")) {
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Escolha inválida!");
				return pergunta2power();
		}	
	}
	
	// PERGUNTA 3
	
	
	static int pergunta3(int jogador){
		int tentativas = 3;

		boolean acertou = false;

			List alternativas3 = new ArrayList();
			alternativas3.add("Os mesmos do conjunto C"); // resposta correta
			alternativas3.add("Os mesmos do conjunto B");
			alternativas3.add("{6}");
			alternativas3.add("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");
			alternativas3.add("Os mesmos do conjunto A");

			System.out.println("Voce ainda esta vivo ? Todos da floresta ja sabem da sua jornada, cuidado a floresta é perigosa e traiçoeira...");
			System.out.println("Vamos ao que interessa, sou o Elfo Fallen e tenho mais um desafio para você");
			System.out.println("Está aqui a sua terceira pergunta..");
			System.out.println("Você tem 3 tentativas !! ");
			System.out.println("");
			System.out.println("┌----------┐");
			System.out.println("|Pergunta 3|");
			System.out.println("└----------┘");
			
			do {
				Collections.shuffle(alternativas3);
				
				System.out.println("\n\tTentativa " + (4 - tentativas));
				System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
				System.out.println("\n\n\"Sabendo que A = {0, 1, 2, 3, 4, 5, 6}, B = {6, 7, 8, 9} e C = {2, 4, 6, 8, 10}, quais são os elementos do conjunto (A∩B)UC?");
				System.out.println("a) " + alternativas3.get(0));
				System.out.println("b) " + alternativas3.get(1));
				System.out.println("c) " + alternativas3.get(2));
				System.out.println("d) " + alternativas3.get(3));
				System.out.println("e) " + alternativas3.get(4));

				System.out.print("Digite a alternativa correta: ");

				String resposta = new Scanner(System.in).next();

				switch (resposta) {
					case "a":
					case "A":
						if (alternativas3.get(0).equals("Os mesmos do conjunto C")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "b":
					case "B":
						if (alternativas3.get(1).equals("Os mesmos do conjunto C")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "c":
					case "C":
						if (alternativas3.get(2).equals("Os mesmos do conjunto C")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "d":
					case "D":
						if (alternativas3.get(3).equals("Os mesmos do conjunto C")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "e":
					case "E":
						if (alternativas3.get(4).equals("Os mesmos do conjunto C")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "P":
					case "p":
					if (jogador == 97 && muigiPower == 2){
						muigiPower = 0;
						if (pergunta3power()) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					}	
					if(jogador == 54 && darioPower == 3){
						darioPower = 0;
						return pergunta3(54);
					}
					default:
						System.out.println("******Escolha inválida!******");
					}
					
			
			
			
			} while (!acertou && tentativas > 0);

			switch(tentativas){
				case 3:
					return 10;
				case 2:
					if(darioPower == 0)
						return 10;
				case 1:
					return 5;
				default:
					return -1;
			}
	}

	static boolean pergunta3power(){
		List alternativas3 = new ArrayList();
		alternativas3.add("Os mesmos do conjunto C"); // resposta correta
		alternativas3.add("Os mesmos do conjunto B");
		alternativas3.add("{6}");

		Collections.shuffle(alternativas3);

		System.out.println("\n\n\"Sabendo que A = {0, 1, 2, 3, 4, 5, 6}, B = {6, 7, 8, 9} e C = {2, 4, 6, 8, 10}, quais são os elementos do conjunto (A∩B)UC?");

		System.out.println("a) " + alternativas3.get(0));
		System.out.println("b) " + alternativas3.get(1));
		System.out.println("c) " + alternativas3.get(2));

		System.out.print("Digite a alternativa correta: ");

		String resposta = new Scanner(System.in).next();

		switch (resposta) {
			case "a":
			case "A":
				if (alternativas3.get(0).equals("Os mesmos do conjunto C")) {
					return true;
				} else {
					return false;
				}
			case "b":
			case "B":
				if (alternativas3.get(1).equals("Os mesmos do conjunto C")) {
					return true;
				} else {
					return false;
				}
			case "c":
			case "C":
				if (alternativas3.get(2).equals("Os mesmos do conjunto C")) {
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Escolha inválida!");
				return pergunta3power();
		}	
	}
	
	// PERGUNTA 4
	
	
	static int pergunta4(int jogador){
		int tentativas = 3;

		boolean acertou = false;

			List alternativas4 = new ArrayList();
			alternativas4.add("20"); // resposta correta
			alternativas4.add("10");
			alternativas4.add("4");
			alternativas4.add("8");
			alternativas4.add("2");

			System.out.println("Pare, Pare, Pare... onde pensa que vai com toda essa rapidez ? ");
			System.out.println("Você realmente é um(a) guerreiro(a) forte, poucos chegam até aqui. Mas será que conseguirá cumprir o próximo desafio ? ");
			System.out.println("Sou o Elfo Random e vamos a quarta pergunta...");
			System.out.println("Você tem 3 tentativas !! ");
			System.out.println("");
			System.out.println("┌----------┐");
			System.out.println("|Pergunta 4|");
			System.out.println("└----------┘");
			
			do {
				Collections.shuffle(alternativas4);
				
				System.out.println("\n\tTentativa " + (4 - tentativas));
				System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
				System.out.println("\nDois conjuntos contêm 7 números pares consecutivos cada. O número de elementos da intersecção desses dois conjuntos é igual a 3. A diferença entre o maior e o menor elemento do conjunto união desses dois conjuntos, nessa ordem, é: ");

				System.out.println("a) " + alternativas4.get(0));
				System.out.println("b) " + alternativas4.get(1));
				System.out.println("c) " + alternativas4.get(2));
				System.out.println("d) " + alternativas4.get(3));
				System.out.println("e) " + alternativas4.get(4));

				System.out.print("Digite a alternativa correta: ");

				String resposta = new Scanner(System.in).next();

				switch (resposta) {
					case "a":
					case "A":
						if (alternativas4.get(0).equals("20")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "b":
					case "B":
						if (alternativas4.get(1).equals("20")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "c":
					case "C":
						if (alternativas4.get(2).equals("20")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "d":
					case "D":
						if (alternativas4.get(3).equals("20")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "e":
					case "E":
						if (alternativas4.get(4).equals("20")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							

						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
						case "P":
				case "p":
					if (jogador == 97 && muigiPower == 2){
						muigiPower = 0;
						if (pergunta4power()) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					}	
					if(jogador == 54 && darioPower == 3){
						darioPower = 0;
						return pergunta4(54);
					}
					default:
						System.out.println("******Escolha inválida!******");
					}
					
			
			
			
			} while (!acertou && tentativas > 0);

			switch(tentativas){
				case 3:
					return 10;
				case 2:
					if(darioPower == 0)
						return 10;
				case 1:
					return 5;
				default:
					return -1;}
	}
	
	static boolean pergunta4power(){
		List alternativas4 = new ArrayList();
		alternativas4.add("20"); // resposta correta
		alternativas4.add("10");
		alternativas4.add("4");

		Collections.shuffle(alternativas4);

		System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
		System.out.println("\nDois conjuntos contêm 7 números pares consecutivos cada. O número de elementos da intersecção desses dois conjuntos é igual a 3. A diferença entre o maior e o menor elemento do conjunto união desses dois conjuntos, nessa ordem, é: ");


		System.out.println("a) " + alternativas4.get(0));
		System.out.println("b) " + alternativas4.get(1));
		System.out.println("c) " + alternativas4.get(2));

		System.out.print("Digite a alternativa correta: ");

		String resposta = new Scanner(System.in).next();

		switch (resposta) {
			case "a":
			case "A":
				if (alternativas4.get(0).equals("20")) {
					return true;
				} else {
					return false;
				}
			case "b":
			case "B":
				if (alternativas4.get(1).equals("20")) {
					return true;
				} else {
					return false;
				}
			case "c":
			case "C":
				if (alternativas4.get(2).equals("20")) {
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Escolha inválida!");
				return pergunta4power();
		}	
	}
	
	// PERGUNTA 5
	
	
	
	static int pergunta5(int jogador){
		int tentativas = 3;

		boolean acertou = false;

			List alternativas4 = new ArrayList();
			alternativas4.add("13"); // resposta correta
			alternativas4.add("12");
			alternativas4.add("5");
			alternativas4.add("22");
			alternativas4.add("6");

			System.out.println("Uauuuuu, você não merece palmas, você merece o Tocantis inteiro. Você foi o(a) unico(a) que chegou até aqui... ");
			System.out.println("Meu nome é Acer e serei o último Elfo da sua jornada");
			System.out.println("Muito bem, vimos que você merece resgatar a princesa, mas antes disso... ");
			System.out.println("Vamos a ultima pergunta...");
			System.out.println("Você tem 3 tentativas !! ");
			System.out.println("");
			System.out.println("┌--------------┐");
			System.out.println("|Pergunta FINAL|");
			System.out.println("└--------------┘");
			
			do {
				Collections.shuffle(alternativas4);
				
				System.out.println("\n\tTentativa " + (4 - tentativas));
				System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
				System.out.println("\nNuma barbearia foram atendidos 63 clientes em um dia, dos quais 41 tiveram suas barbas aparadas e 35, seus cabelos cortados. Quantos clientes tiveram seus cabelos cortados e suas barbas aparadas? ");

				System.out.println("a) " + alternativas4.get(0));
				System.out.println("b) " + alternativas4.get(1));
				System.out.println("c) " + alternativas4.get(2));
				System.out.println("d) " + alternativas4.get(3));
				System.out.println("e) " + alternativas4.get(4));

				System.out.print("Digite a alternativa correta: ");

				String resposta = new Scanner(System.in).next();
				
				
				switch (resposta) {
				
					case "a":
					case "A":
						if (alternativas4.get(0).equals("13")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							System.out.println("Sua pontuação foi" );
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "b":
					case "B":
						if (alternativas4.get(1).equals("13")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "c":
					case "C":
						if (alternativas4.get(2).equals("13")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							
							tentativas -= 1;
						}
						break;
					case "d":
					case "D":
						if (alternativas4.get(3).equals("13")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					case "e":
					case "E":
						if (alternativas4.get(4).equals("13")) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
							
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
						case "P":
				case "p":
					if (jogador == 97 && muigiPower == 2){
						muigiPower = 0;
						if (pergunta5power()) {
							System.out.println("┌-----------------┐");
							System.out.println("|Resposta correta!|");
							System.out.println("└-----------------┘");
							acertou = true;
						} else {
							System.out.println("┌-------------------┐");
							System.out.println("|Resposta incorreta!|");
							System.out.println("└-------------------┘");
							tentativas -= 1;
						}
						break;
					}	
					if(jogador == 54 && darioPower == 3){
						darioPower = 0;
						return pergunta5(54);
					}
					default:
						System.out.println("******Escolha inválida!******");
					}
					
			
			
			
				
			} while (!acertou && tentativas > 0);

			switch(tentativas){
				case 3:
					return 10;
				case 2:
					if(darioPower == 0)
						return 10;
				case 1:
					return 5;
				default:
					return -1;}
	}

	static boolean pergunta5power(){
		List alternativas5 = new ArrayList();
		alternativas5.add("13"); // resposta correta
		alternativas5.add("12");
		alternativas5.add("5");

		Collections.shuffle(alternativas5);

		System.out.println("\nLeia a questão e digite a alternativa que corresponde a resposta correta : ");
		System.out.println("\nNuma barbearia foram atendidos 63 clientes em um dia, dos quais 41 tiveram suas barbas aparadas e 35, seus cabelos cortados. Quantos clientes tiveram seus cabelos cortados e suas barbas aparadas? ");


		System.out.println("a) " + alternativas5.get(0));
		System.out.println("b) " + alternativas5.get(1));
		System.out.println("c) " + alternativas5.get(2));

		System.out.print("Digite a alternativa correta: ");

		String resposta = new Scanner(System.in).next();

		switch (resposta) {
			case "a":
			case "A":
				if (alternativas5.get(0).equals("13")) {
					return true;
				} else {
					return false;
				}
			case "b":
			case "B":
				if (alternativas5.get(1).equals("13")) {
					return true;
				} else {
					return false;
				}
			case "c":
			case "C":
				if (alternativas5.get(2).equals("13")) {
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Escolha inválida!");
				return pergunta5power();
		}	
	}
	
	
//Escolha de personagens
	
	
	static int escolhaPersona(){
		System.out.println("Escolha o seu personagem!!\n" +
		"\n"+
		"O personagem número 1 é o Dário. Seu poder é obter mais 3 alternativas .\n" +
		"Digite 1 (Um) para o escolhe-lo\n\n" +
		"\n"+
		"Existe também o personagem número 2, seu nome é Muigi e sua habilidade especial é Eliminar 2 alternativas.\n" +
		"Digite 2 (Dois) para o escolhe-lo\n\n"+
		"\n"+
		"**ATENÇÃO, APÓS UTILIZAR A HABILIDADE ESPECIAL, VOCÊ FICARÁ 2 RODADAS SEM A MESMA**\n\n"+
		"DURANTE O JOGO PARA UTILIZAR A HABILIDADE ESPECIAL DO SEU PERSONAGEM\n"+
		"DIGITE (P) NO CAMPO DE RESPOSTAS\n\n");
		System.out.println("Digite o numero do seu personagem:  ");
		
		int escolha = new Scanner(System.in).nextInt();

		if (escolha == 1) {
			System.out.println("Personagem escolhido foi o Dario");
			return 54;
		} else if (escolha == 2){
			System.out.println("Personagem escolhido foi o Muigi");
			return 97;
		}else{
			System.out.println("Escolha um personagem Válido\n\n");
			return escolhaPersona();
		}

	}

	
	//PONTUAÇÃO POR RODADA
	
	
	static boolean newGame(){
		

		int pontos = 0, pontuou = 0;

		darioPower = 3;
		muigiPower = 2;

		persona = escolhaPersona();

		pontuou = pergunta1(persona);
		if(darioPower < 3)
				darioPower += 1;

		if ( pontuou == -1) {
			return false; //VOLTA A PERGUNTA
		}else{
			pontos += pontuou;
			System.out.println("Sua pontuação é: "+pontos+ " pontos" );
			System.out.println("");
			if(pontos >= pontosnece){
				return true;
			}
			
			pontuou = pergunta2(persona);
			if(muigiPower < 2)
				muigiPower += 1;
			if(darioPower < 3)
				darioPower += 1;


			if(pontuou == -1){
				return false;
			}else{
				pontos += pontuou;
				System.out.println("Sua pontuação é: "+pontos+ " pontos");
				System.out.println("");
				if(pontos >= pontosnece){
					return true;
					
				}
				
				pontuou = pergunta3(persona);

				if(muigiPower < 2)
					muigiPower += 1;
				if(darioPower < 3)
					darioPower += 1;

				if (pontuou == -1) {
					return false;
				} else {
					pontos += pontuou;
					System.out.println("Sua pontuação é: "+pontos+ " pontos");
					System.out.println("");
					if(pontos >= pontosnece){
						return true;
						
					}
						
					pontuou = pergunta4(persona);

					if(muigiPower < 2)
						muigiPower += 1;
					if(darioPower < 3)
						darioPower += 1;

					if(pontuou == -1){
						return false;
					}else{
						pontos += pontuou;
						System.out.println("Sua pontuação é: "+pontos+ " pontos");
						System.out.println("");
						if(pontos >= pontosnece){
							return true;
							
						}
						
						pontuou = pergunta5(persona);
						if(muigiPower < 2)
							muigiPower += 1;
						if(darioPower < 3)
							darioPower += 1;
						if(pontuou == -1){
							return false;
						}else{
							pontos += pontuou;
							if(pontos >= pontosnece){
								System.out.println("Sua pontuação é: "+pontos+ " pontos");
								System.out.println("");
								return true;
								
							}else{ 
								return false;
							}
									
						}
					}
				}
			}
		}		
	}

	static void credit(){
		System.out.println(" \n" + "\t\tCREATED BY:\n\n"

		+ "\tGABRIEL GUEDES DA ROCHA NUNES\t\n"
		+"\tMARIA EDUARDA VIEIRA ARAGÃO\n"
		+ "\tWESLEY HENRIQUE DE SOUSA BRITO\n"
		+ "\n\t\tTADS C\n"
		+ "\t\t2019\n ");

	}

	public static void main(String[] args) {
		
		int escolha;
		boolean vitoria;
		do {

			escolha = menu();
			switch (escolha) {

				case 1:
					vitoria = newGame();
					if (vitoria){
						System.out.println("\"Parabéns você obteve a pontuação necessária e salvou a princesa\"" );
					}else {
						System.out.println("");
						System.out.println("\"Você chegou ao topo do castelo, mas não alcançou a pontuação necessária, por isso, não conseguiu salvar a princesa.\"" );
						System.out.println("");
						System.out.println("┌----------┐");
						System.out.println("|GAME OVER!|");
						System.out.println("└----------┘");
						System.out.println("");
					}
					credit();
					new Scanner(System.in).nextLine();
					break;
		
				case 2:
					System.out.println("Você escolheu a opção História");
					System.out.println(" \n"
									+

									  "▓╫─▄▀             ▄▀          ▄▀──╫▓ \n"
									+ "▓╫─▀▄           ▐█            ▀▄──╫▓ \n"
									+ "▓╫─▄▌▄          ▀▄            ▄▌▄─╫▓ \n"
									+ "▓▄▀░░░▀▄          ▌         ▄▀░░░▀▄▓ \n"
									+ "▓▓░░░░░░▌      ▄▄▀▀▄▄      ▐░░░░░░▓▓ \n"
									+ "▓▓░░░░░▓▀    ▄▀░░▓▓░░▀▄    ▀▓░░░░░▓▓ \n"
									+ "▓╫▓█▓█▓     ▐▓░░IBM░░░▓▌     ▓█▓█▓╫▓ \n"
									+ "▓╫▐░░░▌     ██▀▀▀▀▀▀▀▀██     ▐░░░▌╫▓ \n"
									+ "▓╫▐░█░▌   ▄▄████████████▄▄   ▐░█░▌╫▓ \n"
									+ "▓╫▐░░░▌   ▐▓▓▓▌▐▒▓▓▒▌▐▓▓▓▌   ▐░░░▌╫▓ \n"
									+ "▓╫▐░█░▌   ▐▓▓▓▌▐▓▒▒▓▌▐▓▓▓▌   ▐░█░▌╫▓ \n"
									+ "▓╫▐░░░▌▄▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▄▐░░░▌╫▓ \n"
									+ "▓╫▐░█░███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███░█░▌╫▓ \n"
									+ "▓╫▐░░░▌░█▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓▒▒▐░█░▌╫▓ \n"
									+ "◙═════════════════════════════════◙ \n"

									+ "Os personagens Dario e Muigi se apaixonam pela princesa Anitta.\n"
									+ "A princesa, confusa com seus sentimentos, decide ir passear pela Floresta Sephira para tomar uma decisão. \n"
									+ "Com a demora de Anitta, suas paixões decidem ir procura-lá, mas por conseguinte, ao chegarem na floresta encontram um elfo, seu nome é Gofin.\n"
									+ "Este informa para eles que a princesa foi raptada por algo ou alguém e que para salva-lá, os dois terão que subir até o topo da torre IBM.\n"
									+ "O elfo ressalta que apenas um dos dois poderá salvar Anitta.\n");
					new Scanner(System.in).nextLine();
					break;

				case 3:
					System.out.println("Você escolheu a opção Regras");
					System.out
							.println(" \n"
									+ " Pontuação por rodada no 1° acerto vale 10 pontos.\n"
									+ " Pontuação por rodada no 2° acerto vale 5 pontos.\n"
									+ " Pontuação por rodada no 3° acerto vale 5 pontos.\n"

									+ " Pontuação (bitcoin) mínima para salvar a princesa = " + pontosnece + " pontos.\n"
									
									+ "\n");
					new Scanner(System.in).nextLine();
					break;

				case 4:
					System.out.println("Você escolheu a opção Créditos");
					credit();
					new Scanner(System.in).nextLine();
					break;

				case 5:
					System.out.println("Você escolheu a opção Voltar");
					new Scanner(System.in).nextLine();
					break;

				case 0:
					System.out.println("Você escolheu a opção Sair");
					new Scanner(System.in).nextLine();
					break;
					
				default:
						System.out.println("Opção inválida!");

			}

			

		} while (escolha != 0);
	
	System.out.println("*** FIM *** ");

	}

}

				