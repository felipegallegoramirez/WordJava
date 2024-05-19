
package com.mycompany.pruebaword;
import java.util.HashMap;
import java.util.Map;

public class PruebaWord {
    public static void main(String[] args) {
        
        // Valores a reemplazar
        Map<String, String> replacements = new HashMap<>();
        //lO PRIMERO
        replacements.put("{{modulename}}", "Medios de Transmisi�n");
        replacements.put("{{module_code}}", "TIC49999");
        replacements.put("{{module_cicle}}", "Pregrado");
        replacements.put("{{module_program}}", "Ingenier�a en Telecomunicaciones");
        replacements.put("{{module_bloq}}", "Programa");
        replacements.put("{{module_credits}}", "4");
        replacements.put("{{module_duration}}", "16 semanas");
        //2DA ETAPA
        replacements.put("{{module_description}}", "La calidad y el uso de los medios de transmisi�n determinal en gran medida la calidad de la comunicaci�n percibida por los usuarios, tambi�n presentan una gran influencia en los costos y capacidades de transmisi�n. Es el medio de transmisi�n el principal elemento a tener en cuenta en la generaci�n de comunicaciones a nivel f�sico.\n" +
"Este espacio brinda las herramientas necesarias para entender la aplicabilidad de los diferentes medios utilizados en el mercado de las comunicaciones, entendiendo los mecanismos que los gobiernan, junto con sus ventajas y desventajas, adicionalmente describe los efectos sobre el espacio debido a la presencia de cargas el�ctricas y distribuciones variantes en el tiempo de carga el�ctricas (electromagnetismo), al igual que las propiedades f�sicas emergentes de la din�mica de grupos de carga que definen propiedades el�ctricas y magn�ticas en un medio de transmisi�n guiado y son la base del funcionamiento de varios dispositivos como el UTP, FTP, STP, Par telef�nico, coaxial, Gu�as de ondas entre otros");
        replacements.put("{{achievement}}", "\n   1.   Describir las tecnolog�as actuales y tendencias futuras de medios de transmisi�n y su impacto en el mercado de las telecomunicaciones para que el profesional sea capaz de interactuar con ingenieros de su campo.\n" +
"\n   2.   Utiliza los conceptos de f�sica electromagn�tica, con el fin de garantizar la calidad de la comunicaci�n percibida por los usuarios, aplicables a los medios de transmisi�n.\n" +
"\n   3.   Aplica la teor�a de acople de impedancias para solucionar problemas de medios de transmisi�n.\n");
        replacements.put("{{tematics_core}}", "1. Introducci�n a los medios de transmisi�n \n 2. Caracterizaci�n de los principales tipos de medios guiados \n 3. L�neas de transmisi�n \n 4. Acople de impedancias y carta de Smith y sus aplicaciones");
        //2DA ETAPA
        replacements.put("{{tematics_axis1}}", "   �   Importancia de los medios de transmisi�n guiados y no guiados en el mercado de las telecomunicaciones.\n" +
"   �   Comparaci�n de los principales medios guiados: Fibra �ptica, UTP, Coaxial, Bifilar y Gu�as de ondas\n" +
"   �   Perdidas en los medios guiados\n" +
"   �   Introducci�n a los conceptos de Impedancia, coeficiente de reflexi�n, VSWR y otros par�metros de inter�s en la caracterizaci�n de medios guiados.\n" +
"   �   Unidades de medida lineal y logar�tmica");
        replacements.put("{{tematics_axis2}}", "   �   La fibra �ptica, introducci�n y usos en Telecomunicaciones\n" +
"   �   Principios �pticos; refracci�n, difracci�n, Snell, frecuencias, comportamientos, radio de curvatura, perdidas.\n" +
"   �   Tipos principales de fibras �pticas: �ndice gradual, multimodo y monomodo, modos, �ndice de refracci�n.\n" +
"   �   Dimensionamiento de trayectos de fibra �ptica en proyectos de telecomunicaciones.");
        replacements.put("{{tematics_axis3}}", "   �   Par�metros de l�nea.\n" +
"   �   Ecuaci�n general de propagaci�n en medios guiados\n" +
"   �   Propagaci�n en l�neas acopladas, en L�neas desacopladas y ondas estacionarias.\n" +
"   �   Carta de Smith\n" +
"   �   La carta de Smith en acople de impedancias, Stub y Doble stub.\n" +
"   �   UTP, FTP, STP y par bifilar entorchado, principales caracter�sticas y diferencias\n" +
"   �   f�sicas, Fabricaci�n, anchos de banda, aplicaciones.\n" +
"   �   Coaxial, Twinaxial, principales caracter�sticas y diferencias f�sicas, Fabricaci�n, anchos de banda, aplicaciones.\n" +
"   �   Microcintas, principales caracter�sticas y diferencias f�sicas, Fabricaci�n, anchos de\n" +
"   �   banda, aplicaciones.\n" +
"   �   Acople de impedancias: transformador 1/4, acoplador reactivo Stub.");
        replacements.put("{{tematics_axis4}}", "   �   Ruido: Tipos de ruido. Efectos de ruido sobre el canal. Temperatura equivalente de ruido de dispositivos activos y pasivos. Ruido en sistemas multietapa y figura de ruido.\n" +
"   �   Efectos del ruido en las prestaciones de un sistema de comunicaciones.\n" +
"   �   Conceptos B�sicos de campos: Gradiente, Rotacional, Divergencia.\n" +
"   �   Campos Magn�ticos: 1. Ley de Ampere 2. Ley de Biot � Savart 3. Fuerzas Magn�ticas 4. Aplicaciones 5. Ley de Faraday 6. Concepto de Inductancia.\n" +
"   �   Modos de transmisi�n en una gu�a de ondas, Modo TE y TH");
        
        
        replacements.put("{{tematics_name_axis1}}", "Introducci�n a los medios de transmisi�n");
        replacements.put("{{tematics_name_axis2}}", "Caracterizaci�n de los principales tipos de medios guiados");
        replacements.put("{{tematics_name_axis3}}", " L�neas de transmisi�n");
        replacements.put("{{tematics_name_axis4}}", "Acople de impedancias y carta de Smith y sus aplicaciones");
        
        //2DA ETAPA
        replacements.put("{{metodology_description}}", "En correspondencia con los postulados del Modelo Pedag�gico del Polit�cnico Grancolombiano se emplean metodolog�as activas en los procesos de ense�anza y de aprendizaje, con el fin de hacer que los estudiantes: \n" +
" \n" +
"   �   Se conviertan en responsables de su propio aprendizaje, desarrollando competencias de pensamiento cr�tico y las habilidades de b�squeda, selecci�n, an�lisis y evaluaci�n de la informaci�n utilizando herramientas acordes a la �poca (para el caso actual corresponde a la tecnolog�a). \n" +
"   �   Participen en actividades que les permitan intercambiar experiencias y opiniones con sus compa�eros (competencias de trabajo en grupo). \n" +
"   �   Lleven a cabo procesos de reflexi�n sobre lo que hacen, c�mo lo hacen y qu� resultados logran (competencias metacognitivas). \n" +
"   �   Tengan conciencia de su entorno y realidad cotidiana a trav�s de actividades, como trabajo de proyectos o estudios de casos, entre otros, en los que usen los conocimientos disciplinares y sean conscientes de estos (m�todos para el aprendizaje). \n" +
" \n" +
"Para esto, las actividades acad�micas de las asignaturas se organizan a trav�s de un conjunto de estrategias y secuencias did�cticas que vinculan m�todos, contenidos, materiales y actividades en funci�n de los resultados de aprendizaje que un estudiante debe alcanzar en correspondencia con los indicadores de logro que contribuyen al alcance de estos. Los procesos de ense�anza y de aprendizaje est�n dise�ados para mediar, interactuar, desarrollar, crear y evaluar el progreso de los estudiantes de acuerdo con la siguiente tipolog�a: ");
        replacements.put("{{metodology_table_tipology}}", "Te�rico Pr�ctica");
        replacements.put("{{metodology_table_description}}", "Comprende los m�dulos en los cuales se privilegia la aplicaci�n de conceptos, definiciones o fundamentos b�sicos de car�cter te�rico, a trav�s de metodolog�as que combinan elementos te�ricos y pr�cticos, teniendo en cuenta un contexto o �mbito espec�fico.");
        replacements.put("{{metodology_table_metodh}}", "Descubrimiento, problemas, casos o ejemplos.");
        replacements.put("{{metodology_table_duration}}", "16 semanas");
        //2DA ETAPA
        replacements.put("{{metodology_metodh}}", " \n" +
"De acuerdo con la tipolog�a de la asignatura, se emplean los m�todos de: i) descubrimiento en el cual se generan hip�tesis teniendo en cuenta estrategias de comparaci�n, an�lisis y semejanzas que se adaptan al esquema cognitivo; el aprendizaje no se presenta al final, sino a trav�s del proceso, y ii) por problemas en el cual aprendizaje parte de la formulaci�n de un problema, cuya soluci�n se construye a trav�s de la adquisici�n y consolidaci�n de conceptos, actividades de reflexi�n y an�lisis de posibles soluciones.");
        replacements.put("{{metodology_resources}}", "Para el desarrollo de la asignatura se utilizan recursos disponibles en plataformas como MOODLE, escritorios remotos, espacios f�sicos y otros, en los que el estudiante encuentra:? \n" +
" \n" +
"   �   Lecturas fundamentales y complementarias (a algunas de las cuales se podr� acceder a trav�s de la biblioteca virtual institucional), y materiales de apoyo y actividades de refuerzo, con el fin de apoyar el aprendizaje de las tem�ticas tratadas.? \n" +
"   �   Herramientas para el desarrollo de encuentros sincr�nicos, a trav�s de Teams, y de interacciones asincr�nicas, por medio de anuncios y mensajer�a interna, siempre que el profesor vea pertinente su uso. ");
        replacements.put("{{metodology_estrategys}}", "Las estrategias y actividades se presentan al largo de la asignatura a trav�s de:\n" +
"Trabajo directo con acompa�amiento sincr�nico:\n" +
"   �   Presentaci�n magistral de los ejes tem�ticos, con participaci�n de los estudiantes.\n" +
"   �   Uso de elementos asociados con los m�todos de:\n" +
"   �   Aprendizaje basado en problemas\n" +
"   �   Clase expositiva\n" +
"   �   TIC\n" +
"   �   Seg�n la pertinencia que evidencie el profesor que acompa�a el proceso formativo.\n" +
"   �   Desarrollo de talleres y ejercicios seg�n las necesidades que van emergiendo en el proceso formativo.\n" +
"   �   Ampliaci�n y resoluci�n de inquietudes conceptuales, casos o problemas.\n" +
"   �   Realizaci�n de acciones de retroalimentaci�n sobre las actividades de aprendizaje y evaluativas.\n" +
"   �   Uso de materiales de apoyo, como actividades introductorias, la declaraci�n de objetivos, la elaboraci�n de res�menes, de organizadores previos, gr�ficos y textuales, figuras, ilustraciones, tablas, y mapas y redes conceptuales u otras representaciones, seg�n se requiera y que favorezcan la comprensi�n y apoyen el abordaje de los contenidos conceptuales, procedimentales o actitudinales a tratar.\n" +
"\n" +
"Trabajo directo con acompa�amiento asincr�nico: \n" +
"\n" +
"Comunicaci�n por mensajer�a interna como mecanismo de interacci�n personal, para contribuir al seguimiento del aprendizaje de los estudiantes respondiendo sus inquietudes, record�ndoles los elementos generales de las actividades de trabajo directo o independiente que deben desarrollar, as� como de las actividades de trabajo colaborativo, cuando las haya.\n" +
"\n" +
"Trabajo independiente con acompa�amiento asincr�nico: \n" +
"\n" +
"   �   Realizaci�n de lecturas para promover el aprendizaje y motivar la indagaci�n para ampliar el conocimiento respecto a los temas por tratar.? \n" +
"   �   Revisi�n del material complementario para ahondar en los temas centrales.?? \n" +
"   �   Desarrollo de talleres o actividades de aprendizaje individuales o grupales, entre las cuales se puede emplear la estrategia de proyecto de investigaci�n formativa.\n" +
"   �   Elaboraci�n de materiales como res�menes, organizadores previos, gr�ficos y textuales, figuras, ilustraciones, tablas, y mapas y redes conceptuales u otras representaciones, seg�n se requiera y que favorezcan la comprensi�n y apoyen el abordaje de los contenidos conceptuales, procedimentales o actitudinales a tratar.\n" +
"   �   An�lisis de casos o problemas asociados con los temas por tratar a lo largo de la asignatura.");
        //2DA ETAPA
        replacements.put("{{evaluation_basic}}", "Las t�cnicas y m�todos para evaluar son diversos y se organizan acorde con las necesidades y tipolog�as de las asignaturas. Cada asignatura eval�a en coherencia con los indicadores de logro declarados, los cuales dan cuenta de los niveles alcanzados a trav�s de las actividades evaluativas de tipo formativo o sumativo, y cuyo desarrollo se hace de manera individual o grupal, en concordancia con su prop�sito. Para esta asignatura se caracteriza por lo siguiente: ");
        replacements.put("{{evaluation_table_tipology}}", "Te�rico Pr�ctica");
        replacements.put("{{evaluation_table_evaluation}}", "Da cuenta de la apropiaci�n de conceptos y teor�as y su respectiva aplicaci�n en contexto. Se plantean casos o problemas desde el aprendizaje por problemas.");
        replacements.put("{{evaluation_table_duration}}", "16 semanas");
        replacements.put("{{evaluation_bottom}}", "La evaluaci�n sumativa comprende los logros obtenidos en cada una de las actividades, as� como en todo el proceso, representados en porcentajes acumulativos en coherencia con la parametrizaci�n que va de 0 a 5; las actividades tienen pesos diferentes, de acuerdo con su complejidad y tipolog�a; siendo una asignatura te�rica la evaluaci�n sumativa da cuenta de la asimilaci�n, conceptualizaci�n, comparaci�n o contraste de teor�as y conceptos. A continuaci�n, la estructura de las actividades:\n" +
"\n" +
"   �   Resoluci�n de problemas\n" +
"   �   Desarrollo de proyectos\n" +
"   �   Talleres\n" +
"   �   Pruebas escritas\n" +
" \n" +
"La evaluaci�n formativa con el an�lisis de contextos, la discusi�n a trav�s de preguntas intercaladas, el uso de mapas conceptuales, desarrollo de casos y ejercicios pr�cticos, seg�n las necesidades del proceso formativo. Para lo anterior, se puede contemplar la incorporaci�n de elementos orientados a la:? \n" +
"   �   Autoevaluaci�n: comprende la valoraci�n que hace el estudiante de sus propias acciones y productos. Desarrolla la capacidad cr�tica, favorece la autonom�a y capacidad para tomar decisiones, permite reformular su m�todo de aprendizaje y autogesti�n incluyendo la organizaci�n de su tiempo.? \n" +
"   �   Coevaluaci�n: se refiere a la evaluaci�n entre pares, fortalece la capacidad cr�tica, la comunicaci�n asertiva, motiva el aprendizaje colaborativo.? \n" +
"   �   Heteroevaluaci�n: se comprende como la evaluaci�n que hace el tutor al estudiante, y a su vez, la evaluaci�n que hace el estudiante al tutor. \n" +
"\n" +
"De otra parte, las acciones de realimentaci�n que se propone emplear a lo largo del proceso formativo para acompa�ar y apoyar el aprendizaje de los estudiantes son:\n" +
"\n" +
"   �   Formar: donde se crean las condiciones para que los estudiantes adquieran conocimientos, habilidades, actitudes, aptitudes y destrezas. Adem�s, debe promover su desarrollo integral y debe acompa�arlos en las situaciones acad�micas que enfrenten durante el desarrollo de un m�dulo o una asignatura. \n" +
"   �   Informar: para que los estudiantes identifiquen los cambios que pueden afectarlos directa o indirectamente tanto en el aula de clase como en otros espacios.\n" +
"   �   Prevenir: con el fin de anticiparse a las situaciones acad�micas que pueden representar dificultad para los estudiantes. Esto se logra a trav�s de la interacci�n individual con los estudiantes y del completo conocimiento del contexto educativo en que el tutor se desenvuelve. \n" +
"   �   Ayudar a decidir: donde se orienta a los estudiantes para que tomen la mejor decisi�n ante una situaci�n concreta. El objetivo es que el estudiante fortalezca su autonom�a y la toma de decisiones responsable.\n" +
"\n" +
"Y el profesor, de acuerdo con las estrategias, recursos y los mecanismos de mediaci�n las llevar� a cabo, seg�n las condiciones y necesidades que se observen en el trabajo directo e independiente.");
        //2DA ETAPA
        replacements.put("{{bibliografy}}", "   �   Elementos de Electromagnetismo, Matthew N. O. Sadiku, Editorial Alfaomega\n" +
"   �   SEARS Francis, F�sica Universitaria, Volumen 2, Editorial Addison Wesley Longman, Quinta edici�n, 1997.\n" +
"   �   L�neas de transmisi�n, Rodolfo Neri Vela, Luis H. Porragas Beltr�n 2013, 2018 Universidad Veracruzana.\n" +
"   �   Sistemas de comunicaciones electr�nicas, Wayne Tomasi");
        
        Modificar asd = new Modificar();
        asd.replaceText(replacements);
        
    }
}