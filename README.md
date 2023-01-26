# slm-test - Square

/api/square/{num} → num^2  

/api/square/5 → 25

Die Rest Schnittstelle gibt fuer die Zahl in Path, das Quadrat als Zahl zurueck.


Anwendungsbeispiel:
```shell
# curl http://localhost:8080/api/square/5 
->25.0
```
Ich habe ein neues Spring Web Projekt erstellt und dann ein github repo erstellt und 
mittels `git remote add origin git@github.com:HamstermitHut/slm-test.git` ein remote meinem Repo hinzugefuegt und einen intialien commit gepusht.
Danach hab ich ein Action maven_develop.yml hinzugefuegt fuer “Continuous Integration and Maven” und einen maven_master.yml fuer “Continuous Delivery”.

Mit `git pull` gepullt.

Dann habe ich ein develop branch mit `git checkout -f -b develop master` erstellt und ein MyRestController erstellt.
Danach habe ich einen square-feature branch mittels “git checkout -f -b square-feature develop” erstellt und ein Kanban
Board names @Markus's slm-test project erstellt eine Userstory angelegt.

Dann habe ich die user story weiter geschoben, quare function programmiert und mit `git commit -m "created square function in MyRestController"` commitet,
danach gepusht.

Dann bin ich zuruech in den develop branch gegangen mit `git checkout develop` und 
habe das feature zu develop gemerged: `git merge square-feature` und danach gepushed
Das selbe hab ich dann mit dem Master `git checkout master` und dem Develop branch (git merge develop) 
gemacht und wieder gepushed. Da ich dieses mal auf den master gepusht habe wurde von der maven_master.yml Action ein jar generiert.