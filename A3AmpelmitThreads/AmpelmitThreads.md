# Ampel mit Threads

## Zustände
Die Nummerierung wird als Zustandsvariable umgesetzt. Der Wechsel der Zustände wird über ein Switch-while Idiom gelöst. Jede Ampel läuft in einem nebenläufigen Thread mit Interface Runnable.


1. Rot
2. Rot-Gelb
3. Grün
4. Gelb


## Benötigte Klassen
- ausführbare Klasse `starteAmpel.java` 
- Klasse `Ampel.java`

## Ampelbeschreibung
- nach starten einer Ampel ist der Zustand rot
- wait definiert die Wartezeit der Zustände

## Testszenario
- Es werden 2 ampeln gestartet
- Es erfolgt die Ausgabe des Namens der Ampelmit zugehörigem Zustand
- Eine gestartete ampel läuft endlos weiter
