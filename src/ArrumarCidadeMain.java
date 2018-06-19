import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class ArrumarCidadeMain {
	private static Robot clicker = null;
	private static Robot keyboard = null;
	private static int casas = 16;
	private static ArrayList<String> accs = new ArrayList<String>();

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		accs.add("NovaConta");

		System.out.println(accs.get(0).toUpperCase());
		executarPassos(accs.get(0));
		wait(2);

	}

	public static void executarPassos(String acc) throws AWTException, IOException, HeadlessException, InterruptedException {
		aceitarAmizade(acc);
		ok(acc);
		fecharJanela(acc);
		construirPiscando(acc);
		botaoVenderEdificio(acc);
		venderArvore(acc);
		venderVerde(acc);
		venderArvore1(acc);
		venderVerde(acc);
		venderArvore2(acc);
		venderVerde(acc);
		cancelarAcao(acc);
		cabana1(acc);
		cabana2(acc);
		cacador1(acc);
		casaGrande1(acc);
		palafita1(acc);
		cacador1(acc);
		umDia(acc);
		botaoMover(acc);
		prefeitura(acc);
		moverPrefeitura(acc);
		moverCabana1(acc);
		cacador1(acc);
		moverCacador1(acc);
		memorial1(acc);
		moverMemorial1(acc);
		cabana2(acc);
		moverCabana2(acc);
		palafita1(acc);
		moverPalafita1(acc);
		casaGrande1(acc);
		moverCasaGrande1(acc);
		militaresMenu(acc);
		lanceirosMenu(acc);
		colocarLanceiros(acc);
		estradaMenu(acc);
		trilhoMenu(acc);
		colocarEstrada1(acc);
		colocarEstrada2(acc);
		trilhoMenu(acc);
		colocarEstrada3(acc);
		colocarEstrada4(acc);		
		trilhoMenu(acc);
		colocarEstrada5(acc);
		colocarEstrada6(acc);
		
				

		// botaoVenderEdificio(acc);
		// zoomIn();
		// venderEstradaT(acc);
		// for (int i = 0; i < 6; i++) {
		// venderEstradaBottomUp(acc);
		// }
		// for (int i = 0; i < 8; i++) {
		// venderEstradaTopDown(acc);
		// }
		// venderEstradaCross(acc);
		// venderEstradaApagada(acc);
	}

	public static void colocarEstrada6(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada6.png")), "colocarEstrada6", acc);
	}
	public static void colocarEstrada5(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada5.png")), "colocarEstrada5", acc);
	}
	public static void colocarEstrada4(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada4.png")), "colocarEstrada4", acc);
	}
	public static void colocarEstrada3(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada3.png")), "colocarEstrada3", acc);
	}
	public static void colocarEstrada2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada2.png")), "colocarEstrada2", acc);
	}
	public static void colocarEstrada1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarEstrada1.png")), "colocarEstrada1", acc);
	}
	public static void trilhoMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\trilhoMenu.png")), "trilhoMenu", acc);
	}
	public static void estradaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\estradaMenu.png")), "estradaMenu", acc);
	}
	public static void colocarLanceiros(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\colocarLanceiros.png")), "colocarLanceiros", acc);
	}
	public static void lanceirosMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\lanceirosMenu.png")), "lanceirosMenu", acc);
	}
	public static void militaresMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\militaresMenu.png")), "militaresMenu", acc);
	}
	public static void aceitarAmizade(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\aceitarAmizade.png")), "aceitarAmizade", acc);
	}

	public static void venderEstradaCross(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderEstradaCross.png")), "venderEstradaCross", acc);
	}

	public static void venderEstradaTopDown(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderEstradaTopDown.png")), "venderEstradaTopDown", acc);
	}

	public static void venderEstradaBottomUp(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderEstradaBottomUp.png")), "venderEstradaBottomUp", acc);
	}

	public static void venderEstradaT(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderEstradaT.png")), "venderEstradaT", acc);
	}

	public static void venderEstradaApagada(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderEstradaApagada.png")), "venderEstradaApagada", acc);
	}

	public static void moverCasaGrande1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverCasaGrande1.png")), "moverCasaGrande1", acc);
	}

	public static void moverPalafita1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverPalafita1.png")), "moverPalafita1", acc);
	}

	public static void moverCabana2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverCabana2.png")), "moverCabana2", acc);
	}

	public static void moverMemorial1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverMemorial1.png")), "moverMemorial1", acc);
	}

	public static void memorial1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\memorial1.png")), "memorial1", acc);
	}

	public static void moverCacador1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverCacador1.png")), "moverCacador1", acc);
	}

	public static void moverCabana1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverCabana1.png")), "moverCabana1", acc);
	}

	public static void moverPrefeitura(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\moverPrefeitura.png")), "moverPrefeitura", acc);
	}

	public static void prefeitura(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\prefeitura.png")), "prefeitura", acc);
	}

	public static void umDia(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\umDia.png")), "umDia", acc);
	}

	public static void cancelarAcao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\cancelarAcao.png")), "cancelarAcao", acc);
	}

	public static void casaGrande1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\casaGrande1.png")), "casaGrande1", acc);
	}

	public static void palafita1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\palafita1.png")), "palafita1", acc);
	}

	public static void cabana2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\cabana2.png")), "cabana2", acc);
	}

	public static void cacador1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\cacador1.png")), "cacador1", acc);
	}

	public static void cabana1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\cabana1.png")), "cabana1", acc);
	}

	public static void venderVerde(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderVerde.png")), "venderVerde", acc);
	}

	public static void venderArvore1(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderArvore1.png")), "venderArvore1", acc);
	}
	public static void venderArvore2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderArvore2.png")), "venderArvore2", acc);
	}

	public static void venderArvore(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\venderArvore.png")), "venderArvore", acc);
	}

	public static void botaoVenderEdificio(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\botaoVenderEdificio.png")), "botaoVenderEdificio", acc);
	}

	public static void construir(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\construir.png")), "construir", acc);
	}

	public static void mapaDoContinente(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mapaDoContinente.png")), "mapaDoContinente", acc);
	}

	public static void recarregar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\recarregar.png")), "recarregar", acc);
	}

	public static void desmarcarOpcao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\desmarcarOpcao.png")), "desmarcarOpcao", acc);
	}

	public static void configuracoes(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\configuracoes.png")), "configuracoes", acc);
	}

	public static void idadeDaPedra(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\idadeDaPedra.png")), "idadeDaPedra", acc);
	}

	public static void voltarACidade2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade2.png")), "voltarACidade2", acc);
	}

	public static void voltarParaVisaoGeral(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarParaVisaoGeral.png")), "voltarParaVisaoGeral", acc);
	}

	public static void useXPontos(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\useXPontos.png")), "useXPontos", acc);
	}

	public static void pesquisaRoda(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaRoda.png")), "pesquisaRoda", acc);
	}

	public static void pesquisaOlaria(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaOlaria.png")), "pesquisaOlaria", acc);
	}

	public static void auxiliar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\auxiliar.png")), "auxiliar", acc);
		Thread.sleep(1000);
	}

	public static void sentarNaTaberna(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\sentarNaTaberna.png")), "sentarNaTaberna", acc);
		Thread.sleep(1000);
	}

	public static void atacarInimigo2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo2.png")), "atacarInimigo2", acc);
	}

	public static void atacarInimigo1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo1.png")), "atacarInimigo1", acc);
	}

	public static void moverLanceiro2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro2.png")), "moverLanceiro2", acc);
	}

	public static void moverLanceiro1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro1.png")), "moverLanceiro1", acc);
	}

	public static void botaoAtacarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacarVerde.png")), "botaoAtacarVerde", acc);
	}

	public static void lanceiro(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\lanceiro.png")), "lanceiro", acc);
	}

	public static void botaoAtacar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacar.png")), "botaoAtacar", acc);
	}

	public static void setor1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\setor1.png")), "setor1", acc);
	}

	public static void provincia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\provincia.png")), "provincia", acc);
	}

	public static void explorar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\explorar.png")), "explorar", acc);
	}

	public static void mapa(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mapa.png")), "mapa", acc);
	}

	public static void pesquisaLancas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaLancas.png")), "pesquisaLancas", acc);
	}

	public static void colocarCasaGrande(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCasaGrande.png")), "colocarCasaGrande", acc);
	}

	public static void casaGrandeMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaGrandeMenu.png")), "casaGrandeMenu", acc);
	}

	public static void coletarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarVerde.png")), "coletarVerde", acc);
	}

	public static void historia2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia2.png")), "historia2", acc);
	}

	public static void colocarPalafita(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarPalafita.png")), "colocarPalafita", acc);
	}

	public static void palafitaMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\palafitaMenu.png")), "palafitaMenu", acc);
	}

	public static void casaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaMenu.png")), "casaMenu", acc);
	}

	public static void historia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia.png")), "historia", acc);
	}

	public static void colocarMemorial(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarMemorial.png")), "colocarMemorial", acc);
	}

	public static void memorialMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\memorialMenu.png")), "memorialMenu", acc);
	}

	public static void decoracaoMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\decoracaoMenu.png")), "decoracaoMenu", acc);
	}

	public static void voltarACidade(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade.png")), "voltarACidade", acc);
	}

	public static void fecharVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\fecharVerde.png")), "fecharVerde", acc);
	}

	public static void abrirOBau(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\abrirOBau.png")), "abrirOBau", acc);
	}

	public static void okVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\okVerde.png")), "okVerde", acc);
	}

	public static void use3Pontos(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\use3Pontos.png")), "use3Pontos", acc);
	}

	public static void pesquisaPalafitas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaPalafitas.png")), "pesquisaPalafitas", acc);
	}

	public static void fecharJanela(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fecharJanela.png")), "Fechar janela", acc);
	}

	public static void abrir(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\abrir.png")), "Abrir", acc);
	}

	public static void logout(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\logout.png")), "Logout", acc);
	}

	public static void sair(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair.png")), "Sair", acc);
	}

	public static void sair2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair2.png")), "Sair2", acc);
	}

	public static void tirarMusica(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarMusica.png")), "tirarMusica", acc);
	}

	public static void tirarSom(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarSom.png")), "tirarSom", acc);
	}

	public static void ok(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\ok.png")), "ok", acc);
	}

	public static void construirPiscando(String acc) throws HeadlessException, AWTException, IOException {
		clicarConstruirPiscando(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\ArrumarCidade\\construirPiscando.png")), "construirPiscando", acc);
	}

	public static void cabanaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cabanaMenu.png")), "cabanaMenu", acc);
	}

	public static void colocarCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCabana.png")), "colocarCabana", acc);
	}

	public static void coletarPrimeiraCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarPrimeiraCabana.png")), "coletarPrimeiraCabana", acc);
	}

	public static void mantimentosMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mantimentosMenu.png")), "mantimentosMenu", acc);
	}

	public static void cacadorMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorMenu.png")), "cacadorMenu", acc);
	}

	public static void colocarCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCacador.png")), "colocarCacador", acc);
	}

	public static void botaoMover(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoMover.png")), "botaoMover", acc);
	}

	public static void pegarCacadorEmConstrucao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pegarCacadorEmConstrucao.png")), "pegarCacadorEmConstrucao", acc);
	}

	public static void moverCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverCacador.png")), "moverCacador", acc);
	}

	public static void cacadorEsperando(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorEsperando.png")), "cacadorEsperando", acc);
	}

	public static void cincoMin(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cincoMin.png")), "cincoMin", acc);
	}

	public static void pesquisa(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisa.png")), "pesquisa", acc);
	}

	public static void escrever(String string) throws AWTException {
		apagar();
		digitar(string);
	}

	public static void digitar(String nome) throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < nome.length(); i++) {
			char[] chars = nome.toUpperCase().toCharArray();
			switch (chars[i]) {
			case 'Ã':
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_A);
				keyboard.keyRelease(KeyEvent.VK_A);
				keyboard.delay(20);
				break;
			case 'Ê':
				keyboard.keyPress(KeyEvent.VK_SHIFT);
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_SHIFT);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_E);
				keyboard.keyRelease(KeyEvent.VK_E);
				keyboard.delay(20);
				break;
			default:
				keyboard.keyPress(chars[i]);
				keyboard.keyRelease(chars[i]);
			}
			keyboard.delay(20);
		}
	}

	public static void apagar() throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < 20; i++) {
			keyboard.keyPress(KeyEvent.VK_BACK_SPACE);
			keyboard.delay(20);
		}
	}

	public static void wait(int segundos) throws AWTException {
		clicker = new Robot();
		System.out.print("Wait " + segundos + "s: ");
		for (int i = 0; i < segundos - 1; i++) {
			clicker.delay(1000);
			System.out.print(i + 1 + ", ");
		}
		clicker.delay(1000);
		System.out.println(segundos);
	}

	public static void clickEvent(double x, double y) throws AWTException {
		clicker = new Robot();
		clicker.mouseMove((int) x, (int) y);
		clicker.delay(500);
		clicker.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		clicker.delay(20);
		clicker.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}

	public static void zoomIn() throws AWTException {
		clicker = new Robot();
		clicker.delay(500);
		clicker.mouseWheel(-50);
		clicker.delay(200);
	}

	public static void zoomOut() throws AWTException {
		clicker = new Robot();
		clicker.mouseWheel(50);
		clicker.delay(200);
	}

	public static void aguardar(ArrayList<BufferedImage> bi, String acao, String acc) throws HeadlessException, AWTException {

		boolean achouUm = false;
		while (!achouUm) {
			achouUm = achouUm || esperarImagem(bi.get(1), acao, acc);
			achouUm = achouUm || esperarImagem(bi.get(0), acao, acc); // Só procura a segunda imagem quando acha a
																		// primeira
		}
	}

	public static void clicar(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		if (acao == "lanceiro") {
			for (int i = 0; i < 1; i++) {
				compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
			}
		}
		compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
	}

	public static void clicarConstruirPiscando(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.5, 3.0, 0, 10, acao, acc);
	}
	public static void clicarRapido(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.5, 0.5, 0, 10, acao, acc);
	}

	public static void clicarLogin(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.6, 0.3, 0, 30, acao, acc);
	}

	public static void clicarColeta(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		zoomIn();
		for (int i = 0; i < casas; i++) {
			compararImagens(bi, 0.6, 0.1, 0, 2, acao + (i + 1), acc);
		}
		wait(3);
		zoomOut();
	}

	public static boolean esperarImagem(BufferedImage bi, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		while (achou == false) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}
					if (!invalid) {
						achou = true;
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
			achou = false;
		}
		return achou;
	}

	public static void compararPixels(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		boolean achouUm = false;
		while (achou == false && count < maxCount) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}

					if (!invalid && !achouUm) {
						achou = true;
						achouUm = true;
						clickEvent(k - (bi.getWidth() * widthMult), l - (bi.getHeight() * heigthMult)); // Clica no centro do objeto
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
			count++;
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
		}
	}

	public static void compararImagens(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException, IOException {
		if (acao == "Auxiliar") {
			for (int i = 0; i < 5; i++) {
				compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
				clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fechar.png")), "Fechar", acc);
			}
		} else {
			compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
		}
	}
}