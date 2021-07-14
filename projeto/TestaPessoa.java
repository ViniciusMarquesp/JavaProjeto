package br.com.generation.projeto;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) throws InterruptedException {

		int quantidadeCandidatos;
		double mediaRenda = 0.00;
		double inscritos = 0.00;
		double contadorIdade1 = 0.00, contadorIdade2 = 0.00;
		double etniaBrancos = 0.00, etniaPardos = 0.00, etniaPretos = 0.00, etniaAmarelos = 0.00, etniaIndigenas = 0.00;
		double generoFeminino = 0.00, generoMasculino = 0.00, generoOutros = 0.00;
		double empregados = 0.00, desempregados = 0.00;
		double renda0 = 0.00, renda1 = 0.00, renda2 = 0.00;
		double ensino1 = 0.00, ensino2 = 0.00, ensino3 = 0.00;
		int Num = 1;
		Pessoa inscrito = new Pessoa();

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		System.out.println("Bem-vindo(a) ao canal de recrutamento e seleção da G Recruitment!\n");
		while(Num == 1) {
		System.out.print("Informe quantas inscrições deseja realizar: ");
		quantidadeCandidatos = read.nextInt();
		for (int inicio = 1; inicio <= quantidadeCandidatos; inicio++) {
			
			System.out.println("==================================================================================");
			System.out.println("                                 Ficha Cadastral                                  ");
			System.out.println("==================================================================================");
			
			System.out.print("Insira o nome: ");
			inscrito.setNome(read.nextLine());
			read.nextLine();

			System.out.print("Insira a idade: ");
			inscrito.setIdade(read.nextInt());

			if (inscrito.getIdade() >= 18 && inscrito.getIdade() <= 40) {

				System.out.print("Insira o RG: ");
				inscrito.setRg(read.next());

				System.out.print("Insira o CPF: ");
				inscrito.setCpf(read.next());

				System.out.print("Informe a etnia:");
				System.out.println(
						"\n1 - Brancos" + "\n2 - Pardos" + "\n3 - Pretos" + "\n4 - Amarelos" + "\n5 - Indígenas");
				System.out.print("R: ");
				inscrito.setEtnia(read.nextInt());

				if (inscrito.getEtnia() > 0 && inscrito.getEtnia() <= 5) {

					System.out.print("Informe o gênero: " + "\n1 - Masculino" + "\n2 - Feminino" + "\n3 - Outros \n");
					System.out.print("R: ");
					inscrito.setGenero(read.nextInt());

					if (inscrito.getGenero() > 0 && inscrito.getGenero() <= 3) {

						System.out.print("Insira o CEP: ");
						inscrito.setEndereco(read.nextInt());

						System.out.print("Insira o número da casa: ");
						inscrito.setNumCasa(read.nextInt());

						System.out.print("Insira o e-mail: ");
						inscrito.setNome(read.next());

						System.out.print("Insira o telefone para contato: ");
						inscrito.setNome(read.next());

						System.out.println("O inscrito trabalha? " + "\n1 - Sim" + "\n2 - Não ");
						System.out.print("R: ");
						inscrito.setTrabalha(read.nextInt());

						if (inscrito.getTrabalha() > 0 && inscrito.getTrabalha() <= 2) {

							System.out.print("Quantas pessoas residem na casa? ");
							inscrito.setPessoasCasa(read.nextInt());

							if (inscrito.getPessoasCasa() > 0) {

								System.out.print("Qual a renda familiar? ");
								inscrito.setRendaCasa(read.nextDouble());

								mediaRenda = inscrito.getRendaCasa() / inscrito.getPessoasCasa();

								if (mediaRenda >= 0.00 && mediaRenda <= 1100.00) {

									System.out.println("Informe o grau de ensino:" + "\n1 - Ensino Médio"
											+ "\n2 - Ensino Superior" + "\n3 - Outro (Ensino Técnico)");
									System.out.print("R: ");
									inscrito.setEnsino(read.nextInt());

									if (inscrito.getEnsino() == 1) {
										System.out.println("==================================================================================");
										System.out.println("			Inscrição finalizada! Boa sorte!						");
										System.out.println("==================================================================================");
										inscritos = inscritos + 1.00;
										} 
									else if (inscrito.getEnsino() == 2 | inscrito.getEnsino() == 3) {
										System.out.print("Informe a área de formação: ");
										inscrito.setCurso(read.next());
										System.out.println("==================================================================================");
										System.out.println("			Inscrição finalizada! Boa sorte!						");
										System.out.println("==================================================================================");
										inscritos = inscritos + 1.00;
									}

									else {
										System.out.println("Opção Inválida para cadastro nesta vaga!.");
										System.out.println("Aguarde contato para vagas ideais para você!");
										System.exit(0);
									}

								} else {
									System.out.println(
											"Sinto muito! Infelizmente a renda informada é incompatível com o programa.");
									System.out.println("Aguarde contato para vagas ideais para você!");
									System.exit(0);
								}

							} else {
								System.out.println("Opção Inválida!");
								System.out.println("Aguarde contato para vagas ideais para você!");
								System.exit(0);
							}

						} else {
							System.out.println("Opção Inválida!");
							System.exit(0);
							
						}

					} else {
						System.out.println("Opção Inválida!");
						System.exit(0);
					}
				} else {
					System.out.println("Opção Inválida!");
					System.exit(0);
				}

			} else {
				System.out.println("Sinto muito! A idade informada não é permitida para participação no programa.");
				System.out.println("Aguarde contato para vagas ideais para você!");
				System.exit(0);
			}

			// Condições para mapeamento
			if (inscrito.getIdade() >= 18 && inscrito.getIdade() <= 29) {
				contadorIdade1 = contadorIdade1 + 1.00;
			} else if (inscrito.getIdade() >= 30 && inscrito.getIdade() <= 40) {
				contadorIdade2 = contadorIdade2 + 1.00;
			}
			if (inscrito.getEtnia() == 1) {
				etniaBrancos = etniaBrancos + 1.00;
			} else if (inscrito.getEtnia() == 2) {
				etniaPardos = etniaPardos + 1.00;
			} else if (inscrito.getEtnia() == 3) {
				etniaPretos = etniaPretos + 1.00;
			} else if (inscrito.getEtnia() == 4) {
				etniaAmarelos = etniaAmarelos + 1.00;
			} else if (inscrito.getEtnia() == 5) {
				etniaIndigenas = etniaIndigenas + 1.00;
			}
			if (inscrito.getGenero() == 1) {
				generoMasculino = generoMasculino + 1.00;
			} else if (inscrito.getGenero() == 2) {
				generoFeminino = generoFeminino + 1.00;
			} else if (inscrito.getGenero() == 3) {
				generoOutros = generoOutros + 1.00;
			}

			if (inscrito.getTrabalha() == 1) {
				empregados = empregados + 1.00;
			} else if (inscrito.getTrabalha() == 2) {
				desempregados = desempregados + 1.00;
			}
			if (mediaRenda == 0.00) {
				renda0 = renda0 + 1.00;
			} else if (mediaRenda > 0.00 && mediaRenda <= 550.99) {
				renda1 = renda1 + 1.00;
			} else if (mediaRenda >= 551.00 && mediaRenda <= 1100.00) {
				renda2 = renda2 + 1.00;
			}
			if (inscrito.getEnsino() == 1) {
				ensino1 = ensino1 + 1.00;
			} else if (inscrito.getEnsino() == 2) {
				ensino2 = ensino2 + 1.00;
			} else if (inscrito.getEnsino() == 3) {
				ensino3 = ensino3 + 1.00;
			}
			
		
		}
		
		
		System.out.println("Você vai se cadastrar? Digite 1\n"
				+ "Você é empregador? Digite 2\n"
				+"Já se cadastrou!? Digite 3");
		System.out.print("R: ");
		Num = read.nextInt();
		
		}	
		if(Num <1 && Num >2) {
			System.out.println("Sistema finalizando.");
			System.exit(0);
		}
		int fim = 1;
		while(fim > 0) {
			System.out.println("\nGerando mapa...");
			fim--;
		}
		Thread.sleep(3000);
		
		for(int i = 1;i<10000;i++)
			System.out.println();
		
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println("Mapeamento de Inscrições - 1ª fase");
		System.out.println("==================================================================================");
		System.out.println("Mapeamento por Idade:");
		System.out.printf("Percentual de inscritos com idade de 18 a 29 anos: %.2f",
				(contadorIdade1 * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos com idade de 30 a 40 anos: %.2f",
				(contadorIdade2 * 100) / inscritos);
		System.out.print("%");
		System.out.println();
		System.out.println("\nMapeamento por Etnia:");
		System.out.printf("Percentual de inscritos brancos: %.2f", (etniaBrancos * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos pardos: %.2f", (etniaPardos * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos pretos: %.2f", (etniaPretos * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos amarelos: %.2f", (etniaAmarelos * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos indígenas: %.2f", (etniaIndigenas * 100) / inscritos);
		System.out.print("%");
		System.out.println();
		System.out.println("\nMapeamento por Gênero:");
		System.out.printf("Percentual de inscritos genêro masculino: %.2f", (generoMasculino * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos genêro feminino: %.2f", (generoFeminino * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos outros gêneros: %.2f", (generoOutros * 100) / inscritos);
		System.out.print("%");
		System.out.println();
		System.out.println("\nMapeamento por Empregados e Desempregados:");
		System.out.printf("Percentual de inscritos empregados: %.2f", (empregados * 100) / inscritos);
		System.out.printf("\nPercentual de inscritos desempregados: %.2f", (desempregados * 100) / inscritos);
		System.out.print("%");
		System.out.println();
		System.out.println("\nMapeamento por Renda Familiar:");
		System.out.printf("Percentual de inscritos sem renda: %.2f", (renda0 * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos com renda de R$0,00 - R$550,00: %.2f", (renda1 * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos com renda de R$551,00 - R$1.100,00: %.2f",
				(renda2 * 100) / inscritos);
		System.out.print("%");
		System.out.println();
		System.out.println("\nMapeamento por Escolaridade:");
		System.out.printf("Percentual de inscritos cursando/formados no ensino médio: %.2f",
				(ensino1 * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos cursando/formados no ensino superior: %.2f",
				(ensino2 * 100) / inscritos);
		System.out.print("%");
		System.out.printf("\nPercentual de inscritos cursando/formados no ensino técnico: %.2f",
				(ensino3 * 100) / inscritos);
		System.out.print("%");
	}
}