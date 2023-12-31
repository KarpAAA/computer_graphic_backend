package com.example.computer_graphic_backend.constants;


import com.example.computer_graphic_backend.data.materials.Material;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class MaterialsConstants {
    private List<Material> materials = new ArrayList<>();


    @PostConstruct
    public void postConstructMethod(){

//        materials.add(new Material("Introduction", "SubInto1", "text1", new byte[]{}));
//        materials.add(new Material("Introduction", "SubInto2", "text2", new byte[]{}));
//        materials.add(new Material("Introduction", "SubInto3", "text3", new byte[]{}));

        materials.add(new Material("Фрактали", "Що таке фрактал", "Фракта́л (від латинського fractus і в перекладі означає той, що складається з фрагментів (подрібнений)) — нерегулярна, самоподібна структура. \n" +
                "Термін фрактал увів у  1975 року Бенуа Мандельброт. \n" +
                "В основі цього явища лежить дуже проста ідея : нескінчену по красі і різноманітності множину фігур можна отримати з відносно простих конструкцій за допомогою всього двох операцій - копіювання і масштабування.\n" +
                "Фрактали знаходять все більше й більше практичних застосувань у науці. Основна причина цього полягає в тому, що вони описують реальний світ іноді навіть краще, ніж традиційна фізика чи математика. Більшість просторових систем у природі є нерегулярним і фрагментарним, форма цих систем погано піддається опису апаратом евклідової геометрії.\n" +
                "Масштабна інваріантність, що спостерігається у фракталах, може бути або точною, або наближеною. Інваріантність - незмінність якої-небудь величини по відношенню до деяких перетворень.\n" +
                "Однією з основних властивостей фракталів є самоподібність.  У найпростішому випадку невелика частина фрактала містить інформацію про весь фрактал. Серед важливих властивостей фракталів з точки зору програмної реалізації ітераційність та рекурсивність фрактальних структур.\n" +
                "Фактично знайдений спосіб легкого представлення складних  об'єктів,  які  схожі на природні. Тобто за допомогою декількох коефіцієнтів можна задати лінії і поверхні дуже складної форми. Фрактальна геометрія незамінна при генерації штучних хмар, гір, поверхні морів тощо.\n" +
                "Фрактальна графіка, як і векторна, заснована на математичних обчисленнях. Однак, базовим елементом є математична формула, ніяких об'єктів у пам'яті комп'ютера не зберігається і зображення будується виключно за формулами,рівняннями.\n", new byte[]{}));
        materials.add(new Material("Фрактали", "Класифікація фракталів", "Геометричні фрактали(конструктивні)\n" +
                "Алгебраїчні фрактали(рекурентні динамічні)\n" +
                "Стохастичні(випадкові)\n" +
                "IFS-фрактали\n" +
                "Геометричні та алгебраїчні фрактали називають детермінованими. Окремо розглядають підвид фракталів, що утворюється через систему ітеративних функцій (Iterated Functions System) – IFS-фрактали. \n" +
                "        Крім вище наведеної класифікації, можна навести поділ фракталів за рівнем самоподібності. За цим критерієм виділяють три типи фракталів:\n" +
                "фрактали точної самоподібності;\n" +
                "фрактали з майже самоподібністю;\n" +
                "фрактали з статистичною самоподібністю.\n" +
                "    Фракталами точної самоподібності є геометричні фрактали, масштабна інваріантність яких є у явному вигляді. До фракталів з майже самоподібністю належать алгебраїчні фрактали. Майже самоподібність означає, що частинки фракталу у певному сенсі (за деяким законом) подібні до цілого зображення. Статистична самоподібність використовує випадкові величини.\n" +
                "\n" +
                "   Ще одна класифікація враховує поняття детермінованості. До детермінованих фракталів належать геометричні, алгебраїчні фрактали, а до недетермінованих  - стохастичні.\n", new byte[]{}));

        materials.add(new Material("Колірні схеми", "Поняття кольору та колірної моделі", "Колір - це  властивість матеріальних об'єктів, яка сприймається як усвідомлене зорове відчуття та виникає в результаті дії на око потоків видимого електронно-магнітного випромінювання (з довжинами хвиль від 380 до 760 нм). Той або інший колір «привласнюється» людиною об'єкту в процесі зорового сприйняття цього об'єкту. Світло сприймається або безпосередньо від джерела, наприклад, від освітлювальних приладів, або як відбиття від поверхонь об'єктів або заломлення при проходженні крізь прозорі і напівпрозорі об'єкти. Амплітуда, що визначає енергію хвилі, відповідає за яскравість кольору. Око людини - складна оптична система. Фоторецептори поділяються на два види: палички і колбочки. Палички є високочутливими елементами і працюють в умовах слабкого освітлення. Вони нечутливі до довжини хвилі і тому не \"розрізняють\" кольору. Колбочки, навпаки, \"розрізняють\" колір. Паличок існує тільки один тип, а колбочки поділяються на три види, кожен з яких чутливий до певного діапазону довжин хвиль (довгі, середні або короткі). Саме поняття кольору є особливістю людського \"бачення\" навколишнього середовища. Перехід від одного кольору до іншого здійснюється безперервно, поступово. Кожному кольору співставляється не якась одна довжина хвилі світла, а довжини хвиль, що потрапляють в деякий інтервал значень.\n" +
                "Призначення колірної моделі - дати засоби опису кольору в межах деякого колірного діапазону, у тому числі і для виконання інтерполяції кольорів. Існують різні моделі, оскільки із зображенням виконуються різні дії: відображення на екран, видрук на принтер, опрацювання кольорів, перетворення в сірі тони, корекція яскравості, інтенсивності і т.п. Кожна модель має своє призначення, тобто ефективна для виконання окремих операцій. Запропоновано класифікувати моделі за принципом апаратної залежності. Апаратно-орієнтовані триколірні моделі - це RGB (αRGB, sRGB), CMY (CMYK). апаратно-незалежні триатрибутні моделі, які поділяються на перцепційні  HSV, HSL, HSІ, HSВ і т.д.  та модифіковані CIE XYZ, CIE Lab\n", new byte[]{}));
        materials.add(new Material("Колірні схеми", "Адитивна модель RGB", "Схема адитивних кольорів працює на основі принципу  випромінювання світла. RGB використовується в дисплеях для формування кольорів.\n" +
                "У цій схемі відсутністю всіх кольорів є чорний колір, а присутність всіх кольорів - білий.\n" +
                "Простір RGB геометрично представляють кубом в координатному просторі з початком відліку (0,0,0), вісь Х – компонента червоного кольору, вісь У – зелена компонента, вісь Z – синя компонента.\n" +
                "Будь-який колір у такому випадку представляється точкою з трьома координатами (r,g,b), де r,g,b є [0;1]. Можливе також трактування, що де r,g,b є [0;255].\nНедолік RGB - обмеженість у застосуванні, лише на пристроях, які працюють за принципом випромінювання, неможливість відображення деяких кольорів, а саме насичених зелено-синіх.", new byte[]{}));
        materials.add(new Material("Колірні схеми", "Субтрактивна модель CMY", "Апаратно-орієнтована модель, яка використовується для формування кольорів на основі принципу віднімання від падаючого світлового потоку частини, яка формується шаром фарби з трьох компонент (блакитний/Cyan, Magenta/пурпурний, Yellow/жовтий).\n" +
                "Тому модель CMY називають субтрактивною (від англ. «sub» віднімати).\n" +
                "Колір в CMY утворюється при відніманні інших кольорів  від загального променя світла (r+g+b).\n" +
                "У цій схемі білий колір утворюється в результаті відсутності всіх кольорів, тоді як їх присутність дає чорний колір.\n" +
                "Схема субтрактивних кольорів працює на основі принципу відбиття та поглинання світла.\n" +
                "Дана система була широко відома задовго до того, як комп'ютери почали використовуватися для створення графічних зображень. Її область застосування – поліграфія.\n" +
                "У просторі RGB навпроти базових кольорів розміщено базові кольори CMY. Кажуть, що вони доповнюють один одного, поглинають. Кольори моделі CMY є додатковими до кольорів моделі RGB, тобто доповнюючими їх до білого.\n" +
                "Таким чином система координат CMY - той же куб, що і для RGB, але з початком відліку в точці з RGB- координатами (1,1,1), відповідною білому кольору.\n" +
                "Насправді на практиці користуються системою CMYK (а не CMY). Компонента K  (від “Black”) введена додатково, оскільки це не економно змішувати 3 “непрості” фарби для отримання “простого” чорного кольору, тим більше ідеального чорного кольору змішуванням трьох базових не отримується (модель допускає певні неточності).\n" +
                "Зв’язок адитивної та субтрактивної моделей можна представити математичним виразом.\n", new byte[]{}));
        materials.add(new Material("Колірні схеми", "Перцепційні моделі кольорів", "Перцепція — чуттєве сприйняття зовнішніх предметів людиною. Призначення перцепційних моделей кольорів відобразити зміст сприйняття кольору людиною. Такі моделі використовуються , щоб позбутися обмежень, що накладаються апаратним забезпеченням. Перцепційними моделями є HSV, HSL, HSB, HSI.\n" +
                "Ці моделі застосовуються у задачах коли коректування яскравості, насиченості, перетворення зображення в сіре та ін.\n" +
                "HSV задається трьома атрибутами:\n" +
                "\n" +
                "Hue – колірний тон,\n" +
                "Saturation - насиченість ,\n" +
                "Value – інтенсивність.\n" +
                "Ця модель побудована на основі суб'єктивного сприйняття кольору людиною і добре узгоджується з нею.Компонента Н визначається довжиною хвилі домінуючої компоненти в спектрі, (“чистий пігмент”). Колірний тон вимірюється в градусах кута.\n" +
                "Доповнюючі кольори відрізняються на 180ْ. Пари доповнюючих кольорів (ті, що поглинають один одного): червоний 0ْ – блакитний 180ْ; жовтий 60ْ – синій 240ْ; зелений 120ْ – пурпуровий 300ْ.\n" +
                "Компоненти S i V змінюються від 0 до 1.\n" +
                "S – насиченість або чистота кольору, визначається часткою білого кольору. S вказує наскільки колір близький до “чистого” пігменту і визначається відстанню до осі піраміди.\n" +
                "V – інтенсивність, вказує на загальну кількість світлового потоку, що потрапляє в око, (яскравість). V=0 відповідає вершині і задає чорний колір.\n" +
                "Вісь піраміди задає сірі кольори (S=0) від чорного до білого (центр основи).\n" +
                "При моделюванні кольору через HSV  порушується колірне рівняння. Це пов'язане з лінійною залежністю компонентів H і V, що є наслідком особливістю сприйняття кольорів людиною при різних умовах освітлення  . При зменшенні освітленості  зелені кольори синіють,  сині стають фіолетовими, жовті – оранжевими, оранжеві – червоними. Все це відображається на бічних поверхнях геометричного простору HSV.\n", new byte[]{}));


        materials.add(new Material("Афінні перетворення", "Афінне перетворення", "За видом функції перетворення розрізняють лінійні та нелінійні перетворення. Якщо при всіх і = 1, 2, ..., N функції fi — лінійні відносно аргументів (k1, k2,..., kn), тобто:\n" +
                " \n" +
                "де ai,j (j=1,2,…n+1)  – константи, то такі перетворення називають лінійними, а при n=N – афінними.\n" +
                "\n" +
                "Якщо хоча б для одного i функція fi – нелінійна відносно (k1, k2,..., kn), тоді перетворення координат в цілому не є лінійним.\n" +
                "Наприклад, перетворення:\n" +
                " \n" +
                "нелінійне, оскільки у виразі для Y присутнє xy.\n" +
                "Тут матриця коефіцієнтів (аij) множиться на матрицю – стовпець (ki) і в результаті отримаємо матрицю - стовпець (mi).\n" +
                "Властивості афінних перетворень:\n" +
                "·        n-вимірний об’єкт відображається в n-вимірний, точка – в точку, лінія – в лінію, поверхня – в поверхню;\n" +
                "·        зберігається паралельність ліній і площин;\n" +
                "·        зберігаються пропорції паралельних об’єктів (довжин відрізків на паралельних прямих і площ на паралельних площинах).\n" +
                "Ці властивості дозволяють будувати прообрази полігонів на площині й поліедрів у просторі за скінченим набором точок – їх вершинами.\n", new byte[]{}));
        materials.add(new Material("Афінні перетворення", "Види афінних перетворень", "Переміщення/зсув;\n" +
                "масштабування (збільшення/зменшення);\n" +
                "поворот на кут.\n", new byte[]{}));
        materials.add(new Material("Афінні перетворення", "Переміщення/зсув", "Елементарним зсувом вважається паралельне перенесення об'єкта (системи координат) на задані величини відносно початку координат (0,0).\n" +
                "   \n" +
                "а) паралельний зсув координат точки на вектор (m, n) в даній системі координат задається формулами :\n" +
                " \n" +
                "б) зсув системи координат на вектор (m, n) задається формулами :\n" +
                " \n", new byte[]{}));
        materials.add(new Material("Афінні перетворення", "Масштабування (збільшення/зменшення)", "Задається як зміна одиничних відрізків\n" +
                " \n" +
                "Тоді координати точки M в новій системі (0X`Y`) будуть визначатися за формулами\n" +
                " \n" +
                "де а=1/i1, d=1/i2, i1, i2 – значення нових одиничних відрізків у старій системі координат (0XY) . Наприклад, для рис. 3 коефіцієнти масштабування обчислюються як а=1:і`(1:1/2), d=1:j (1:4)\n" +
                "Аналогічно масштабування розтяг/стиск об’єкту вздовж координатних осей можна записати такими ж формулами (11.6).\n" +
                "Елементарним масштабуванням вважається перетворення відносно початку координат (0,0).\n" +
                "Якщо a = d, то маємо пропорційне масштабування, якщо a ≠ d, то масштабування – непропорційне. При a = d > 1 відбувається збільшення зображення, при a = d < 1 – рівномірний стиск.\n" +
                "При a = 1, d = –1 одержуємо дзеркальне відображення відносно осі x,\n" +
                "при a = –1, d =1 – дзеркальне відображення відносно осі y.\n" +
                "e.\tповорот на кут\n" +
                "   \n" +
                "а) поворот точки відносно початку координат на кут ϕ проти годинникової стрілки задається формулами\n" +
                " \n" +
                "б) поворот системи координат на кут ϕ проти годинникової стрілки задається формулами\n", new byte[]{}));

    }
}
