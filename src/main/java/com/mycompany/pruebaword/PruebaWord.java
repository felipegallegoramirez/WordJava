
package com.mycompany.pruebaword;
import java.util.HashMap;
import java.util.Map;

public class PruebaWord {
    public static void main(String[] args) {
        
        // Valores a reemplazar
        Map<String, String> replacements = new HashMap<>();
        //lO PRIMERO
        replacements.put("{{modulename}}", "Medios de Transmisión");
        replacements.put("{{module_code}}", "TIC49999");
        replacements.put("{{module_cicle}}", "Pregrado");
        replacements.put("{{module_program}}", "Ingeniería en Telecomunicaciones");
        replacements.put("{{module_bloq}}", "Programa");
        replacements.put("{{module_credits}}", "4");
        replacements.put("{{module_duration}}", "16 semanas");
        //2DA ETAPA
        replacements.put("{{module_description}}", "La calidad y el uso de los medios de transmisión determinal en gran medida la calidad de la comunicación percibida por los usuarios, también presentan una gran influencia en los costos y capacidades de transmisión. Es el medio de transmisión el principal elemento a tener en cuenta en la generación de comunicaciones a nivel físico.\n" +
"Este espacio brinda las herramientas necesarias para entender la aplicabilidad de los diferentes medios utilizados en el mercado de las comunicaciones, entendiendo los mecanismos que los gobiernan, junto con sus ventajas y desventajas, adicionalmente describe los efectos sobre el espacio debido a la presencia de cargas eléctricas y distribuciones variantes en el tiempo de carga eléctricas (electromagnetismo), al igual que las propiedades físicas emergentes de la dinámica de grupos de carga que definen propiedades eléctricas y magnéticas en un medio de transmisión guiado y son la base del funcionamiento de varios dispositivos como el UTP, FTP, STP, Par telefónico, coaxial, Guías de ondas entre otros");
        replacements.put("{{achievement}}", "\n   1.   Describir las tecnologías actuales y tendencias futuras de medios de transmisión y su impacto en el mercado de las telecomunicaciones para que el profesional sea capaz de interactuar con ingenieros de su campo.\n" +
"\n   2.   Utiliza los conceptos de física electromagnética, con el fin de garantizar la calidad de la comunicación percibida por los usuarios, aplicables a los medios de transmisión.\n" +
"\n   3.   Aplica la teoría de acople de impedancias para solucionar problemas de medios de transmisión.\n");
        replacements.put("{{tematics_core}}", "1. Introducción a los medios de transmisión \n 2. Caracterización de los principales tipos de medios guiados \n 3. Líneas de transmisión \n 4. Acople de impedancias y carta de Smith y sus aplicaciones");
        //2DA ETAPA
        replacements.put("{{tematics_axis1}}", "   •   Importancia de los medios de transmisión guiados y no guiados en el mercado de las telecomunicaciones.\n" +
"   •   Comparación de los principales medios guiados: Fibra óptica, UTP, Coaxial, Bifilar y Guías de ondas\n" +
"   •   Perdidas en los medios guiados\n" +
"   •   Introducción a los conceptos de Impedancia, coeficiente de reflexión, VSWR y otros parámetros de interés en la caracterización de medios guiados.\n" +
"   •   Unidades de medida lineal y logarítmica");
        replacements.put("{{tematics_axis2}}", "   •   La fibra óptica, introducción y usos en Telecomunicaciones\n" +
"   •   Principios ópticos; refracción, difracción, Snell, frecuencias, comportamientos, radio de curvatura, perdidas.\n" +
"   •   Tipos principales de fibras ópticas: Índice gradual, multimodo y monomodo, modos, índice de refracción.\n" +
"   •   Dimensionamiento de trayectos de fibra óptica en proyectos de telecomunicaciones.");
        replacements.put("{{tematics_axis3}}", "   •   Parámetros de línea.\n" +
"   •   Ecuación general de propagación en medios guiados\n" +
"   •   Propagación en líneas acopladas, en Líneas desacopladas y ondas estacionarias.\n" +
"   •   Carta de Smith\n" +
"   •   La carta de Smith en acople de impedancias, Stub y Doble stub.\n" +
"   •   UTP, FTP, STP y par bifilar entorchado, principales características y diferencias\n" +
"   •   físicas, Fabricación, anchos de banda, aplicaciones.\n" +
"   •   Coaxial, Twinaxial, principales características y diferencias físicas, Fabricación, anchos de banda, aplicaciones.\n" +
"   •   Microcintas, principales características y diferencias físicas, Fabricación, anchos de\n" +
"   •   banda, aplicaciones.\n" +
"   •   Acople de impedancias: transformador 1/4, acoplador reactivo Stub.");
        replacements.put("{{tematics_axis4}}", "   •   Ruido: Tipos de ruido. Efectos de ruido sobre el canal. Temperatura equivalente de ruido de dispositivos activos y pasivos. Ruido en sistemas multietapa y figura de ruido.\n" +
"   •   Efectos del ruido en las prestaciones de un sistema de comunicaciones.\n" +
"   •   Conceptos Básicos de campos: Gradiente, Rotacional, Divergencia.\n" +
"   •   Campos Magnéticos: 1. Ley de Ampere 2. Ley de Biot – Savart 3. Fuerzas Magnéticas 4. Aplicaciones 5. Ley de Faraday 6. Concepto de Inductancia.\n" +
"   •   Modos de transmisión en una guía de ondas, Modo TE y TH");
        
        
        replacements.put("{{tematics_name_axis1}}", "Introducción a los medios de transmisión");
        replacements.put("{{tematics_name_axis2}}", "Caracterización de los principales tipos de medios guiados");
        replacements.put("{{tematics_name_axis3}}", " Líneas de transmisión");
        replacements.put("{{tematics_name_axis4}}", "Acople de impedancias y carta de Smith y sus aplicaciones");
        
        //2DA ETAPA
        replacements.put("{{metodology_description}}", "En correspondencia con los postulados del Modelo Pedagógico del Politécnico Grancolombiano se emplean metodologías activas en los procesos de enseñanza y de aprendizaje, con el fin de hacer que los estudiantes: \n" +
" \n" +
"   •   Se conviertan en responsables de su propio aprendizaje, desarrollando competencias de pensamiento crítico y las habilidades de búsqueda, selección, análisis y evaluación de la información utilizando herramientas acordes a la época (para el caso actual corresponde a la tecnología). \n" +
"   •   Participen en actividades que les permitan intercambiar experiencias y opiniones con sus compañeros (competencias de trabajo en grupo). \n" +
"   •   Lleven a cabo procesos de reflexión sobre lo que hacen, cómo lo hacen y qué resultados logran (competencias metacognitivas). \n" +
"   •   Tengan conciencia de su entorno y realidad cotidiana a través de actividades, como trabajo de proyectos o estudios de casos, entre otros, en los que usen los conocimientos disciplinares y sean conscientes de estos (métodos para el aprendizaje). \n" +
" \n" +
"Para esto, las actividades académicas de las asignaturas se organizan a través de un conjunto de estrategias y secuencias didácticas que vinculan métodos, contenidos, materiales y actividades en función de los resultados de aprendizaje que un estudiante debe alcanzar en correspondencia con los indicadores de logro que contribuyen al alcance de estos. Los procesos de enseñanza y de aprendizaje están diseñados para mediar, interactuar, desarrollar, crear y evaluar el progreso de los estudiantes de acuerdo con la siguiente tipología: ");
        replacements.put("{{metodology_table_tipology}}", "Teórico Práctica");
        replacements.put("{{metodology_table_description}}", "Comprende los módulos en los cuales se privilegia la aplicación de conceptos, definiciones o fundamentos básicos de carácter teórico, a través de metodologías que combinan elementos teóricos y prácticos, teniendo en cuenta un contexto o ámbito específico.");
        replacements.put("{{metodology_table_metodh}}", "Descubrimiento, problemas, casos o ejemplos.");
        replacements.put("{{metodology_table_duration}}", "16 semanas");
        //2DA ETAPA
        replacements.put("{{metodology_metodh}}", " \n" +
"De acuerdo con la tipología de la asignatura, se emplean los métodos de: i) descubrimiento en el cual se generan hipótesis teniendo en cuenta estrategias de comparación, análisis y semejanzas que se adaptan al esquema cognitivo; el aprendizaje no se presenta al final, sino a través del proceso, y ii) por problemas en el cual aprendizaje parte de la formulación de un problema, cuya solución se construye a través de la adquisición y consolidación de conceptos, actividades de reflexión y análisis de posibles soluciones.");
        replacements.put("{{metodology_resources}}", "Para el desarrollo de la asignatura se utilizan recursos disponibles en plataformas como MOODLE, escritorios remotos, espacios físicos y otros, en los que el estudiante encuentra:? \n" +
" \n" +
"   •   Lecturas fundamentales y complementarias (a algunas de las cuales se podrá acceder a través de la biblioteca virtual institucional), y materiales de apoyo y actividades de refuerzo, con el fin de apoyar el aprendizaje de las temáticas tratadas.? \n" +
"   •   Herramientas para el desarrollo de encuentros sincrónicos, a través de Teams, y de interacciones asincrónicas, por medio de anuncios y mensajería interna, siempre que el profesor vea pertinente su uso. ");
        replacements.put("{{metodology_estrategys}}", "Las estrategias y actividades se presentan al largo de la asignatura a través de:\n" +
"Trabajo directo con acompañamiento sincrónico:\n" +
"   •   Presentación magistral de los ejes temáticos, con participación de los estudiantes.\n" +
"   •   Uso de elementos asociados con los métodos de:\n" +
"   •   Aprendizaje basado en problemas\n" +
"   •   Clase expositiva\n" +
"   •   TIC\n" +
"   •   Según la pertinencia que evidencie el profesor que acompaña el proceso formativo.\n" +
"   •   Desarrollo de talleres y ejercicios según las necesidades que van emergiendo en el proceso formativo.\n" +
"   •   Ampliación y resolución de inquietudes conceptuales, casos o problemas.\n" +
"   •   Realización de acciones de retroalimentación sobre las actividades de aprendizaje y evaluativas.\n" +
"   •   Uso de materiales de apoyo, como actividades introductorias, la declaración de objetivos, la elaboración de resúmenes, de organizadores previos, gráficos y textuales, figuras, ilustraciones, tablas, y mapas y redes conceptuales u otras representaciones, según se requiera y que favorezcan la comprensión y apoyen el abordaje de los contenidos conceptuales, procedimentales o actitudinales a tratar.\n" +
"\n" +
"Trabajo directo con acompañamiento asincrónico: \n" +
"\n" +
"Comunicación por mensajería interna como mecanismo de interacción personal, para contribuir al seguimiento del aprendizaje de los estudiantes respondiendo sus inquietudes, recordándoles los elementos generales de las actividades de trabajo directo o independiente que deben desarrollar, así como de las actividades de trabajo colaborativo, cuando las haya.\n" +
"\n" +
"Trabajo independiente con acompañamiento asincrónico: \n" +
"\n" +
"   •   Realización de lecturas para promover el aprendizaje y motivar la indagación para ampliar el conocimiento respecto a los temas por tratar.? \n" +
"   •   Revisión del material complementario para ahondar en los temas centrales.?? \n" +
"   •   Desarrollo de talleres o actividades de aprendizaje individuales o grupales, entre las cuales se puede emplear la estrategia de proyecto de investigación formativa.\n" +
"   •   Elaboración de materiales como resúmenes, organizadores previos, gráficos y textuales, figuras, ilustraciones, tablas, y mapas y redes conceptuales u otras representaciones, según se requiera y que favorezcan la comprensión y apoyen el abordaje de los contenidos conceptuales, procedimentales o actitudinales a tratar.\n" +
"   •   Análisis de casos o problemas asociados con los temas por tratar a lo largo de la asignatura.");
        //2DA ETAPA
        replacements.put("{{evaluation_basic}}", "Las técnicas y métodos para evaluar son diversos y se organizan acorde con las necesidades y tipologías de las asignaturas. Cada asignatura evalúa en coherencia con los indicadores de logro declarados, los cuales dan cuenta de los niveles alcanzados a través de las actividades evaluativas de tipo formativo o sumativo, y cuyo desarrollo se hace de manera individual o grupal, en concordancia con su propósito. Para esta asignatura se caracteriza por lo siguiente: ");
        replacements.put("{{evaluation_table_tipology}}", "Teórico Práctica");
        replacements.put("{{evaluation_table_evaluation}}", "Da cuenta de la apropiación de conceptos y teorías y su respectiva aplicación en contexto. Se plantean casos o problemas desde el aprendizaje por problemas.");
        replacements.put("{{evaluation_table_duration}}", "16 semanas");
        replacements.put("{{evaluation_bottom}}", "La evaluación sumativa comprende los logros obtenidos en cada una de las actividades, así como en todo el proceso, representados en porcentajes acumulativos en coherencia con la parametrización que va de 0 a 5; las actividades tienen pesos diferentes, de acuerdo con su complejidad y tipología; siendo una asignatura teórica la evaluación sumativa da cuenta de la asimilación, conceptualización, comparación o contraste de teorías y conceptos. A continuación, la estructura de las actividades:\n" +
"\n" +
"   •   Resolución de problemas\n" +
"   •   Desarrollo de proyectos\n" +
"   •   Talleres\n" +
"   •   Pruebas escritas\n" +
" \n" +
"La evaluación formativa con el análisis de contextos, la discusión a través de preguntas intercaladas, el uso de mapas conceptuales, desarrollo de casos y ejercicios prácticos, según las necesidades del proceso formativo. Para lo anterior, se puede contemplar la incorporación de elementos orientados a la:? \n" +
"   •   Autoevaluación: comprende la valoración que hace el estudiante de sus propias acciones y productos. Desarrolla la capacidad crítica, favorece la autonomía y capacidad para tomar decisiones, permite reformular su método de aprendizaje y autogestión incluyendo la organización de su tiempo.? \n" +
"   •   Coevaluación: se refiere a la evaluación entre pares, fortalece la capacidad crítica, la comunicación asertiva, motiva el aprendizaje colaborativo.? \n" +
"   •   Heteroevaluación: se comprende como la evaluación que hace el tutor al estudiante, y a su vez, la evaluación que hace el estudiante al tutor. \n" +
"\n" +
"De otra parte, las acciones de realimentación que se propone emplear a lo largo del proceso formativo para acompañar y apoyar el aprendizaje de los estudiantes son:\n" +
"\n" +
"   •   Formar: donde se crean las condiciones para que los estudiantes adquieran conocimientos, habilidades, actitudes, aptitudes y destrezas. Además, debe promover su desarrollo integral y debe acompañarlos en las situaciones académicas que enfrenten durante el desarrollo de un módulo o una asignatura. \n" +
"   •   Informar: para que los estudiantes identifiquen los cambios que pueden afectarlos directa o indirectamente tanto en el aula de clase como en otros espacios.\n" +
"   •   Prevenir: con el fin de anticiparse a las situaciones académicas que pueden representar dificultad para los estudiantes. Esto se logra a través de la interacción individual con los estudiantes y del completo conocimiento del contexto educativo en que el tutor se desenvuelve. \n" +
"   •   Ayudar a decidir: donde se orienta a los estudiantes para que tomen la mejor decisión ante una situación concreta. El objetivo es que el estudiante fortalezca su autonomía y la toma de decisiones responsable.\n" +
"\n" +
"Y el profesor, de acuerdo con las estrategias, recursos y los mecanismos de mediación las llevará a cabo, según las condiciones y necesidades que se observen en el trabajo directo e independiente.");
        //2DA ETAPA
        replacements.put("{{bibliografy}}", "   •   Elementos de Electromagnetismo, Matthew N. O. Sadiku, Editorial Alfaomega\n" +
"   •   SEARS Francis, Física Universitaria, Volumen 2, Editorial Addison Wesley Longman, Quinta edición, 1997.\n" +
"   •   Líneas de transmisión, Rodolfo Neri Vela, Luis H. Porragas Beltrán 2013, 2018 Universidad Veracruzana.\n" +
"   •   Sistemas de comunicaciones electrónicas, Wayne Tomasi");
        
        Modificar asd = new Modificar();
        asd.replaceText(replacements);
        
    }
}