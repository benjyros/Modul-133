# Lern-Bericht
Benjamin Peterhans

## Einleitung

In diesem Kleinprojekt habe ich mir die Aufgabe gegeben, eine RGB-To-Hex Webseite zu programmieren.

## Was habe ich gelernt?

Ich habe gelernt, wie man verschiedene Eingabearten anwenden und validieren kann.

## Beschreibung

Auf dieser Webseite kann man verschiedene Werte von 0 bis 255 eingeben. Je nach Eingabe wird somit der Wert abgespeichert und beim Einreichen des "Formulars" der Hintergrund gewechselt. Für die Eingabe wird das RGB-System verwendet. Je nach Wert verändert somit die Farbe nach diesem System. Bei Einreichen dieser Werte wird das RGB-System in einen Hex-Wert konvertiert und somit zurückgegeben, sodass sich die Farbe des Hintergrundes ändert. Mit einer kurzen Demo können Sie die Anwendung ansehen.

### Codesnippet

```xhtml
<h:form>
    <!-- Eingabe des Wertes Rot mit einem normalen Textfeld. -->
    <h:outputLabel for="red" value="Red: "/>
    <h:inputText value="#{LA_9952_ManagedBean.red}" id="red" size="5" maxlength="3">
        <f:validateLongRange minimum="0" maximum="255"/>
    </h:inputText>
    <br></br>
    <br></br> 
    <!-- Eingabe des Wertes Grün mit einer Liste. -->
    <h:outputLabel for="green" value="Green: "/>
    <h:selectOneListbox value="#{LA_9952_ManagedBean.green}" id="green" size="5">
        <f:selectItems value="#{LA_9952_ManagedBean.numbers}" />  
    </h:selectOneListbox>
    <br></br>
    <br></br>
    <!-- Eingabe des Wertes Blau mit einem Dropdownmenu. -->
    <h:outputLabel for="blue" value="Blue: "/>
    <h:selectOneMenu value="#{LA_9952_ManagedBean.blue}" id="blue"> 
        <f:selectItems value="#{LA_9952_ManagedBean.numbers}" />   
    </h:selectOneMenu>  
    <h:commandButton value="Submit" action = "#{LA_9952_ManagedBean.rgbToHex()}" /> 
</h:form>
```

### Demo
[![IMAGE ALT TEXT](http://img.youtube.com/vi/jS86Wj6ncVc/0.jpg)](http://www.youtube.com/watch?v=jS86Wj6ncVc "RGB to Hex")

## Verifikation

Durch den Codesnippet in der Beschreibung validiere ich die mir gegebene Aufgabe dieses Auftrags. Insgesamt drei Eingabeelemente wurden benutzt: Textfeld, Liste und Dropdown.

# Reflektion zum Arbeitsprozess

Beim Angehen dieser Aufgabe verlief das meiste gut. Einige Probleme bin ich schon darauf gestossen, die aber mit etwas Nachschlagen im Internet gelöst wurden. Am Anfang dieses Auftrags hatte ich einige persönliche Probleme mit meiner NetBeans IDE, da der GlassFish Server einige Male nicht richtig heruntergeladen wurde. Erst mit einigen Anläufen wurde dieses Problem gelöst. Auch hatte ich Probleme beim Starten der Website, da der GlassFish Server immer wieder "undeployed" war. In server.log von GlassFish konnte ich herausfinden, dass zwei Java-Klassen den gleichen Namen hatten: Der Controller und die ManagedBean hatten den Namen "LA_9552_ManagedBean". Mit dem Umändern des Namens wurde somit auch dieses Problem gelöst. Ansonsten konnte ich gut mit dem Internet als Hilfsmittel den Auftrag erledigen. Für die neuen Eingabeelemente und auch für die Konvertierung von RGB zu Hex habe ich als Hilfe "tutorialspoint" und "Stackoverflow" benutzt. Die Links werden unten nach einen Verbesserungsvorschlag an mich aufgezeigt.

## Verbesserungsvorschlag

Hauptsächlich habe ich keinen Verbesserungsvorschlag zur Bearbeitung des Auftrags, aber zu zukünftigen neuen Projekten mit JSF. Da ich Probleme mit der IDE und dem Aufstarten der Website hatte, könnte ich dies in einem kleinen "Cheat-Sheet" alle Angehensweisen aufschreiben, sodass ich nicht immer im Internet nachschlagen muss. Mit dem könnte ich alle "Aufgaben setzen", die ich beim Erstellen eines Web-Projektes machen soll, sodass es keine Fehler ergeben.

## Links

- Range-Eingaben: https://stackoverflow.com/questions/30591996/validate-if-input-number-is-in-range-from-1-to-60
- Validierung von Texteingaben: https://stackoverflow.com/questions/19269507/accept-only-digits-for-hinputtext-value
- RGB zu Hex: https://stackoverflow.com/questions/3607858/convert-a-rgb-color-value-to-a-hexadecimal-string
