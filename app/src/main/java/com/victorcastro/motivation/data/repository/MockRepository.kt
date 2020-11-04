package com.victorcastro.motivation.data.repository

import com.victorcastro.motivation.data.model.MotivationConstants
import java.util.*


data class Phrase (val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING

    private val mListPhrase: List<Phrase> = listOf(
        Phrase("“Ganhar uma guerra é tão desastroso quanto perdê-la.” – Agatha Christie", HAPPY),
        Phrase("“O homem que não tem imaginação, não tem asas.” – Mohammad Ali", HAPPY),
        Phrase("“Cultive todas as pessoas, as certas vão brotar.” – Aluísio de Paula", HAPPY),
        Phrase(" “Você deve guardar um dragão dentro de si. Quando precisar, você deixa o dragão sair.” – Anderson Silva", HAPPY),
        Phrase("“Enquanto as outas meninas queriam ser bailarinas, eu queria ser um vampiro.” – Angelina Jolie", HAPPY),
        Phrase("“O essencial é invisível aos olhos.” – Antoine de Saint-Exupéry", HAPPY),
        Phrase("“O carinho, como o jogo e a comida, exige certa dosagem.” – Anton Makarenko", HAPPY),
        Phrase("“Não viva para que sua presença seja notada, mas para que sua falta seja sentida.” – Bob Marley", HAPPY),
        Phrase("“A música pode mudar o mundo porque pode mudar as pessoas.” – Bono Vox", HAPPY),
        Phrase("“O que somos é consequência do que pensamos.” – Buda", HAPPY),
        Phrase(" “Encontre o que você ama e deixe que isso te mate.” – Charles Bukowski", HAPPY),
        Phrase("“Cada um sabe a dor e a delícia de ser o que é.” – Caetano Veloso", HAPPY),
        Phrase("“Não sei aonde vou, mas já estou no caminho.” – Carl Sandburg", HAPPY),
        Phrase("“Na vida sempre fazemos escolhas. Ainda que escolhemos não escolher.” – Carmen Miranda", HAPPY),
        Phrase("“As pessoas têm medo das mudanças. Eu tenho medo que as coisas nunca mudem.” – Chico Buarque", HAPPY),
        Phrase("“Eu tenho uma alma que é feita de sonhos.” – Chorão", HAPPY),
        Phrase("“Nós somos feitos da matéria de que são feitos os sonhos” – William Shakespeare", HAPPY),
        Phrase("“Você nunca vai chegar ao seu destino se você parar e atirar pedras em cada cão que late.” – Winston Churchill", HAPPY),
        Phrase("“Até cortar os próprios defeitos pode ser perigoso. Nunca se sabe qual é o defeito que sustenta nosso edifício inteiro.” – Clarice Lispector", HAPPY),
        Phrase("“A felicidade está por dentro, mas não vai sair no Raio X. Você provoca os próprios sentimentos. O que você faz pra ser feliz?” – Clarice Falcão", HAPPY),
        Phrase("“O mais corajoso dos atos ainda é pensar com a própria cabeça.” – Coco Chanel", HAPPY),
        Phrase("“Eu gosto do impossível porque lá a concorrência é menor.” – Walt Disney", HAPPY),
        Phrase("“Todos estamos matriculados na escola da vida, onde o mestre é o tempo.” – Cora Coralina", HAPPY),
        Phrase("“Feliz aquele que transfere o que sabe e aprende o que ensina.” – Cora Coralina", HAPPY),
        Phrase("“Ter problemas na vida é inevitável. Ser derrotado por eles é opcional.” – Roger Crowford", HAPPY),
        Phrase("“Minha religião é simples. Minha religião é a bondade.” – Dalai Lama", HAPPY),
        Phrase("“Estritamente falando, há apenas um dever: o de ser feliz.” – Denis Diderot", HAPPY),
        Phrase("“Acho que a coisa a se fazer é curtir o passeio, enquanto você está nele.” – Johnny Depp", HAPPY),
        Phrase("“Sente-se sufocado aquele sem um objetivo de vida.” – Fiódor Dostoiévski", HAPPY),
        Phrase("“O bom humor nos salva das mãos do doutor.” – Dráuzio Varella", HAPPY),
        Phrase(" “A única coisa que sabemos sobre o futuro é que ele será diferente.” – Peter Drucker", HAPPY),
        Phrase("“Espíritos grandiosos sempre encontraram oposição violenta de mentes medíocres.” – Albert Einstein", HAPPY),
        Phrase("“Criatividade é a inteligência se divertindo.” – Albert Einstein", HAPPY),
        Phrase("“Beleza é estar confortável em sua própria pele. É conhecer e aceitar quem você é.” – Ellen DeGeneres", HAPPY),
        Phrase("“Você é o único representante do seu sonho na face da Terra. Se isso não fizer você correr, chapa, eu não sei o que vai.” – Emicida", HAPPY),
        Phrase("“Prefiro conviver com um ateu honesto e humanista a conviver com um religioso hipócrita.” – Padre Fábio de Mello", HAPPY),
        Phrase("“Ser feliz sem motivo é a mais autêntica forma de felicidade.” – Carlos Drummond de Andrade", HAPPY),
        Phrase("“Você pode tudo se tiver entusiasmo.” – Henry Ford", HAPPY),
        Phrase("“A mente é como um pára-quedas: só funciona aberta.” – Frank Zappa", HAPPY),
        Phrase("“Pés, para que os quero, se tenho asas para voar?” – Frida Kahlo", HAPPY),
        Phrase("“Seja a mudança que você quer ver no mundo.” – Mahatma Gandhi", HAPPY),
        Phrase("“Todo mundo tem talento, é só uma questão de se mexer até descobrir qual é.” – George Lucas", HAPPY),
        Phrase(" “Não abandone suas três grandes e inabaláveis amigas: a intuição, a inocência e a fé.” – George Gurdjieff", HAPPY),
        Phrase(" “Se as mulheres são melhores do que os homens não poderia dizer. Mas posso dizer que certamente não são piores.” – Golda Meir", HAPPY),
        Phrase("“As pessoas que espalham amor não têm tempo nem disposição para jogar pedras.” – Irmã Dulce", HAPPY),
        Phrase("“Quem derruba a gente é a gente mesmo.” – Ivete Sangalo", HAPPY),
        Phrase("“Não acredito em pessoas que se complementam. Acredito em pessoas que se somam.” – Arnaldo Jabor", MORNING),
        Phrase("“Você pode destruir o seu hoje se preocupando com o amanhã.” – Janis Joplin", MORNING),
        Phrase("“Você aprende mais na falha do que jamais irá aprender no sucesso.” – Jay Z", MORNING),
        Phrase("“O principal objetivo na educação é criar pessoas capazes de fazer coisas novas e não simplesmente repetir o que outras gerações fizeram.” – Jean Piaget", MORNING),
        Phrase("“Não sou a melhor pessoa do mundo, mas pelo menos não finjo ser quem não sou.” – Jessie J.", MORNING),
        Phrase("“São as nossas decisões e nossas habilidade que demonstram quem somos na realidade.” – J. K. Rowling", MORNING),
        Phrase("“É bem melhor pensar sem falar, do que falar sem pensar.” – Jô Soares", MORNING),
        Phrase("“Cada sonho que você deixa para trás é um pedaço do seu futuro que deixa de existir.” – Steve Jobs", MORNING),
        Phrase("“Minha saúde mental é perfeita, eu não evito o amor nunca.” – Leila Diniz", MORNING),
        Phrase("“É preciso ter dúvidas. Só os estúpidos têm uma confiança absoluta em si mesmos.” – Orson Welles", MORNING),
        Phrase("“Repara bem no que não digo.” – Paulo Leminskir", MORNING),
        Phrase(" “A vida é o que acontece enquanto você está ocupado fazendo planos.” – John Lennon", MORNING),
        Phrase("“Onde não há lei, não há liberdade.” – John Locke", MORNING),
        Phrase("“O que me preocupa não é o grito dos maus. É o silêncio dos bons.” – Martin Luther King Jr.", MORNING),
        Phrase("“Não espere por líderes, faça sozinho, pessoa a pessoa.” – Madre Teresa de Calcutá", MORNING),
        Phrase("“Quando a caminhada fica dura, só os duros continuam caminhando.” – Mano Brown", MORNING),
        Phrase("“Dizem que virei sensação do dia pra noite. Não foi do dia pra noite. Foram anos de trabalho duro.” – Margot Robbie", MORNING),
        Phrase("“A imperfeição é bela, a loucura é genial e é melhor ser absolutamente ridículo que absolutamente chato.” – Marilyn Monroe", MORNING),
        Phrase("“Coragem é a resistência ao medo e não à ausência dele.” – Mark Twain", MORNING),
        Phrase("“O ódio tem sido a causa de vários problemas no mundo, mas, até hoje, ele não resolveu nenhum.” – Maya Angelou", MORNING),
        Phrase("“O maior presente dos seres humanos é o poder da empatia.” – Maryl Streep", MORNING),
        Phrase("“A educação é a arma mais poderosa para mudar o mundo.” – Nelson Mandela", MORNING),
        Phrase("“Sem a música, a vida seria um erro.” – Friedrich Nietzsche", MORNING),
        Phrase("“A maior aventura que você pode viver é viver a vida dos seus sonhos.” – Oprah Winfrey", MORNING),
        Phrase("“Certas criaturas têm a mania de dar bons conselhos, precisando tanto deles para si. É o que chamo de cúmulo da ignorância.” – Oscar Wilde", MORNING),
        Phrase("“Seja você mesmo. Todas as outras personalidades já têm dono.” – Oscar Wilde", MORNING),
        Phrase("“Não há saber mais ou saber menos: há saberes diferentes.” – Paulo Freire", MORNING),
        Phrase("“O segredo da vida é cair sete vezes e levantar-se oito.” – Paulo Coelho", MORNING),
        Phrase("“Algumas coisas não precisam fazer sentido, basta valer a pena!” – Renato Russo", MORNING),
        Phrase("“Nunca deixe que lhe digam que não vale a pena acreditar no sonho que se tem.” – Renato Russo", MORNING),
        Phrase("“Imaginação é quando a inteligência se diverte.” – Rita Lee", MORNING),
        Phrase("“A medida do amor é amar sem medida.” – Santo Agostinho", MORNING),
        Phrase("“De que adianta falar de motivos? Às vezes, basta um só. Às vezes, nem juntando todos.” – José Saramago", MORNING),
        Phrase("“Qualquer sonho pode se tornar realidade se você tiver disciplina e trabalhar duro.” – Serena Williams", MORNING),
        Phrase("“Todo mundo é capaz de dominar uma dor, exceto quem a sente.” – William Shakespeare", MORNING),
        Phrase("“Ninguém nasce mulher: torna-se mulher.” – Simone de Beauvoir", MORNING),
        Phrase("“Para cada noite escura, há um dia brilhante.” – Tupac Shakur", MORNING),
        Phrase("“Uma jornada de mil milhas começa com um simples passo.” – Lao Tzu", MORNING),
        Phrase("“Amar é querer estar perto, se longe; e mais perto, se perto.” – Vinicius de Moraes", MORNING),
        Phrase("“Um dia sem risada é um dia desperdiçado” – Charlie Chaplin", MORNING)
    )

    fun getPhrase(categoryID: Int): String {

        val filtered = mListPhrase.filter {
            (it.category == categoryID || categoryID == ALL) }

        val  rand = Random().nextInt(mListPhrase.size)

        return mListPhrase[rand].description
    }
}