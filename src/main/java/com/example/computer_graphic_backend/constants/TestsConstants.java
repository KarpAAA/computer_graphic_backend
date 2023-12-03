package com.example.computer_graphic_backend.constants;


import com.example.computer_graphic_backend.data.materials.tests.Answer;
import com.example.computer_graphic_backend.data.materials.tests.Test;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class TestsConstants {
    private List<Test> testList = new ArrayList<>();
    @PostConstruct
    public void postConstruct(){
        testList.add(new Test("Хто вперше використав термін \"фрактал\"",
                List.of(new Answer("Леонардо да Вінчі",false),
                        new Answer("Бенуа Мандельброт",true),
                        new Answer("Айзек Ньютон",false)
                )));
        testList.add(new Test("Що означає термін \"фрактал\"",
                List.of(new Answer("Геометрична фігура, яка має натурально-випадкову форму",false),
                        new Answer("Об'єкт, який має властивість самоподібності на будь-якому масштабі",true),
                        new Answer("Елементарна частинка атома", false))));
        testList.add(new Test("Як виглядає фрактал Жуліа на комплексній площині?",
                List.of(new Answer("Пряма лінія",true),
                        new Answer("Коло",false),
                        new Answer("Спектральна смуга",false))));

        testList.add(new Test("Яка основна ідея \"самоподібності\" у фракталах?",
                List.of(new Answer("Кожен елемент є ідентичним самому собі або своїй частині",true),
                        new Answer("У фракталах немає самоподібності",false),
                        new Answer("Кожен елемент подібний до іншого, але не самому собі",false))));


        testList.add(new Test("Де можна зустріти застосування фракталів у сучасному світі?",
                List.of(new Answer("Тільки в мистецтві",false),
                        new Answer("У науці, комп'ютерній графіці, медицині та інтернет-технологіях", true),
                        new Answer("Тільки в математиці",false))));

        testList.add(new Test("Що позначає абревіатура \"RGB\" в контексті кольорової моделі?",
                List.of(new Answer("Реальні, глибокі, бліде",false),
                        new Answer("Червоний, зелений, синій",true),
                        new Answer("Радіус, градієнт, блиск",false))));

        testList.add(new Test("CMYK-кольорова модель",
                List.of(new Answer("Відображення кольорів на екрані монітора",false),
                        new Answer("Друку та видавництва",true),
                        new Answer("Створення комп'ютерної графіки",false))));

        testList.add(new Test("Як визначається перцепційна колірна схема?",
                List.of(new Answer("Відношення кольорів за кількістю використання",false),
                        new Answer("З урахуванням відчуттів та сприйняття людьми кольорів",true),
                        new Answer("Розташування кольорів в просторі", false))));

        testList.add(new Test("Які основні кольори використовуються в RGB-моделі для створення інших відтінків?",
                List.of(new Answer("Жовтий, фіолетовий, оранжевий",false),
                        new Answer("Червоний, зелений, синій",true),
                        new Answer("Чорний, білий, сірий",false))));
        testList.add(new Test("Які кольори представлені в CMYK-моделі для створення друкарських ілюстрацій?",
                List.of(new Answer("Синій, рожевий, коричневий, жовтий",false),
                        new Answer("Червоний, зелений, синій, чорний",false),
                        new Answer("Ціан, магента, жовтий, чорний",true))));


        testList.add(new Test("Що включають в себе афінні перетворення в геометрії?",
                List.of(new Answer("Тільки обертання фігур",false),
                        new Answer("Збільшення та зменшення фігур",false),
                        new Answer("Комбінацію зсуву, обертання, зміни масштабу та відображення",true))));

        testList.add(new Test("Як визначається зсув афінного перетворення на площині?",
                List.of(new Answer("Тільки зміною розмірів фігури",false),
                        new Answer("Переміщенням фігури на відстань по горизонталі та вертикалі",true),
                        new Answer("Тільки обертанням фігури",false))));

        testList.add(new Test("Як виглядає відображення під час афінного перетворення?",
                List.of(new Answer("Зміна розмірів фігури",false),
                        new Answer("Обертання навколо центральної точки",false),
                        new Answer("Симетричне відображення фігури відносно прямої або точки",true))));

        testList.add(new Test("Яким чином відбувається обертання фігури в рамках афінного перетворення?",
                List.of(new Answer("Зміною її форми",false),
                        new Answer("Обертанням навколо центральної точки",true),
                        new Answer("Тільки зсувом фігури",false))));

        testList.add(new Test("Як впливає зміна масштабу на фігуру під час афінного перетворення?",
                List.of(new Answer("Зміна її розмірів",true),
                        new Answer("Тільки обертання",false),
                        new Answer("Зміна форми фігури", false))));
    }
}


