# SimpleFraction
TP Numéro 1 TODL 
# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    On constate que quand on coche une de ces cases,on aura un commit initial qui se crée et si on ne coche pas il ne va pas y avoir de commit qui se crée.

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    git config --global user.name"uvsq21606277"
    git config --global user.email"tinhinane.berkani@ens.uvsq.fr"
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init 
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add Main.java
    git add Fraction.java
    git commit -m"valider les changements"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    //Le constructeur : 
    Fraction(int x,int y){
        this.x=x;
        this.y=y;
    }
    // La méthode toString : 
    public String toString(){
        return ("Fraction de " + this.x + "sur" + this.y);
    }
    // Code pour tester toString
    Fraction f;
        f=new Fraction(10,5);
        System.out.println(f.toString());
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    git add Main.java
    git add Fraction.java
    git commit -m" publier les modifications"
    git push git push https://github.com/uvsq21606277/SimpleFraction

1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Ce fichier est fait pour donner à l'utilisateur qui visite notre dépot une idée du projet,quel langage a été utilisé,les termes et conditions..etc
    l'extension .md est pour le langage Markdown.
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git pull origin master 
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    Créer sur l'iIDE le fichier .gitignore
    # Copier ici le contenu de `.gitignore`
    *.class
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    Dans mon cas c'est : SimpleFraction.iml
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ``` echo "SimpleFraction.iml" > .gitignore
    # Copier ici les modifications de `.gitignore`
    *.class
    SimpleFraction.iml
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique 
    IL faut générer deux paires de clé SSH avec la commande ssh-keygen
    On les retrouvera dans notre ordinateur généralement dans le dossier ssh dans home 
    id_rsa: clé privée
    id_rsa.pub:clé publique à partager avec les machines avec lesquelles on souhaite communiquer 
    On copie le contenu de la clé SSH publique .
    On va sur GitHub,dans les Settings,on génère une clé SSH avec NEW SSH KEY
    On colle le contenu du id_rsa.pub et on valide.


## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > OS:Debian utilisant le noyau Linux
    Shell : *bash*
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
     help va afficher une liste des commandes shell qui peuvent nous intéresser 
     help COMMANDE va afficher une description de la commande coresspondante.
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # ls -lS du plus grand au plus petit 
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # wc -l monfichier
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        grep -w 'uneVAriable' Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
    grep -rl `uneVariable' *.java
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # find /arb -name "README.md"
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # diff file1.txt file2.txt
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        Permettre la connexion à distance d'un appareil à un autre,puis la manipulation en ligne de commande
    * `screen`/`tmux`
        > permet d'ouvrir plusieurs terminaux dans une meme console,de passer de l'un à l'autre et de les récupérer plus tard.
        Possibilité de partager un terminal avec un autre utilisateur.idéal pour aider un utilisateur distant.
    * `curl`/[HTTPie](https://httpie.org/)
        > vérifier la connectivité aux URL et transfère les données 
    * [jq](https://stedolan.github.io/jq/)
        > transformer ou reformater des données structurées à travers différents protocoles.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > IntelliJ Idea

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > File ==> File Properties==> File Encoding
1. Comment choisir le JDK à utiliser dans un projet ?
    > SDK ==> + ==> JDK ==> choisir
1. Comment préciser la version Java des sources dans un projet ?
    > File ==> Project Structure==>Project Settings==>Project
1. Comment ajouter une bibliothèque externe dans un projet ?
    > File==> ProjectStructure ==> Librairies==> +
1. Comment reformater un fichier source Java ?
    > Ouvrir un fichier dans l'éditeur et appuyer dans la fenêtre de l'outil Projet, cliquer avec le bouton droit sur le fichier et sélectionner Reformater le code.
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Find
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > en utilisant les live templates
1. Comment renommer une classe dans l'ensemble du projet ?
    > REfactor
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Run ==> Edit configurations ==> program arguments 
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > 
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici