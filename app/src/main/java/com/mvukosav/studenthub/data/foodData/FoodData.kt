package com.mvukosav.studenthub.data.foodData

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Food
import com.mvukosav.studenthub.domain.models.WeeklyMenu
import com.mvukosav.studenthub.utils.TimeUtil.getWeekRange
import com.mvukosav.studenthub.utils.TimeUtil.isTimeBetween
import com.mvukosav.studenthub.utils.TimeUtil.isToday
import java.time.LocalTime

class FoodData {
    val foodData = initWeeklyMenuData()

    private fun initWeeklyMenuData(): List<WeeklyMenu> {

        var isBreakFastTime =
            isTimeBetween(LocalTime.now(), LocalTime.of(0, 0), LocalTime.of(10, 59))
        val isLunchTime = isTimeBetween(LocalTime.now(), LocalTime.of(11, 0), LocalTime.of(17, 59))
        val isDinnerTime = isTimeBetween(LocalTime.now(), LocalTime.of(18, 0), LocalTime.of(23, 59))

        if (!isBreakFastTime && !isLunchTime && !isDinnerTime) {
            isBreakFastTime = true
        }

        val breakFest = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals1(false),
            isSelected = isBreakFastTime
        )

        val breakFest1 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals2(false),
            isSelected = isBreakFastTime
        )
        val breakFest2 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals3(false),
            isSelected = isBreakFastTime
        )

        val breakFest3 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals4(false),
            isSelected = isBreakFastTime
        )

        val breakFest4 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals5(false),
            isSelected = isBreakFastTime
        )

        val breakFest5 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals6(false),
            isSelected = isBreakFastTime
        )

        val breakFest6 = DailyMenu(
            dayPartCategory = CategoryDay.BREAKFAST,
            food = getListOfMeals7(false),
            isSelected = isBreakFastTime
        )

        val lunch = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals9(),
            isSelected = isLunchTime
        )

        val lunch1 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals10(),
            isSelected = isLunchTime
        )

        val lunch2 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals11(),
            isSelected = isLunchTime
        )

        val lunch3 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals12(),
            isSelected = isLunchTime
        )

        val lunch4 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals13(),
            isSelected = isLunchTime
        )

        val lunch5 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals14(),
            isSelected = isLunchTime
        )

        val lunch6 = DailyMenu(
            dayPartCategory = CategoryDay.LUNCH,
            food = getListOfMeals15(),
            isSelected = isLunchTime
        )


        val dinner = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals16(),
            isSelected = isDinnerTime
        )

        val dinner1 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals17(),
            isSelected = isDinnerTime
        )

        val dinner2 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals18(),
            isSelected = isDinnerTime
        )

        val dinner3 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals19(),
            isSelected = isDinnerTime
        )

        val dinner4 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals20(),
            isSelected = isDinnerTime
        )

        val dinner5 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals21(),
            isSelected = isDinnerTime
        )

        val dinner6 = DailyMenu(
            dayPartCategory = CategoryDay.DINNER,
            food = getListOfMeals22(),
            isSelected = isDinnerTime
        )

        val dailyMenu1: List<DailyMenu> = listOf(breakFest, lunch, dinner)
        val dailyMenu2: List<DailyMenu> = listOf(breakFest1, lunch1, dinner1)
        val dailyMenu3: List<DailyMenu> = listOf(breakFest2, lunch2, dinner2)
        val dailyMenu4: List<DailyMenu> = listOf(breakFest3, lunch3, dinner3)
        val dailyMenu5: List<DailyMenu> = listOf(breakFest4, lunch4, dinner4)
        val dailyMenu6: List<DailyMenu> = listOf(breakFest5, lunch5, dinner5)
        val dailyMenu7: List<DailyMenu> = listOf(breakFest6, lunch6, dinner6)

        val dateDays = getWeekRange()
        val monday = WeeklyMenu(Day.MONDAY, dateDays[0].toString(), dailyMenu1, isToday(Day.MONDAY))
        val tuesday =
            WeeklyMenu(Day.TUESDAY, dateDays[1].toString(), dailyMenu2, isToday(Day.TUESDAY))
        val wednesday =
            WeeklyMenu(Day.WEDNESDAY, dateDays[2].toString(), dailyMenu3, isToday(Day.WEDNESDAY))
        val thursday =
            WeeklyMenu(Day.THURSDAY, dateDays[3].toString(), dailyMenu4, isToday(Day.THURSDAY))
        val friday = WeeklyMenu(Day.FRIDAY, dateDays[4].toString(), dailyMenu5, isToday(Day.FRIDAY))
        val saturday =
            WeeklyMenu(Day.SATURDAY, dateDays[5].toString(), dailyMenu6, isToday(Day.SATURDAY))
        val sunday = WeeklyMenu(Day.SUNDAY, dateDays[6].toString(), dailyMenu7, isToday(Day.SUNDAY))

        return listOf(monday, tuesday, wednesday, thursday, friday, saturday, sunday)
    }

    private fun getListOfMeals1(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal1()
        val drinks = getDrinks1()
        val deserts = getDeserts1()
        val others = getOthers1()
        val menus = getMenu1()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals2(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal2()
        val drinks = getDrinks2()
        val deserts = getDeserts2()
        val others = getOthers2()
        val menus = getMenu2()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals3(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal3()
        val drinks = getDrinks3()
        val deserts = getDeserts3()
        val others = getOthers3()
        val menus = getMenu3()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals4(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal4()
        val drinks = getDrinks4()
        val deserts = getDeserts4()
        val others = getOthers4()
        val menus = getMenu4()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals5(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal5()
        val drinks = getDrinks5()
        val deserts = getDeserts5()
        val others = getOthers5()
        val menus = getMenu5()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals6(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal6()
        val drinks = getDrinks6()
        val deserts = getDeserts6()
        val others = getOthers6()
        val menus = getMenu6()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals7(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal7()
        val drinks = getDrinks7()
        val deserts = getDeserts7()
        val others = getOthers7()
        val menus = getMenu7()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals9(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal9()
        val drinks = getDrinks9()
        val deserts = getDeserts9()
        val others = getOthers9()
        val menus = getMenu9()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals10(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal10()
        val drinks = getDrinks10()
        val deserts = getDeserts10()
        val others = getOthers10()
        val menus = getMenu10()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals11(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal11()
        val drinks = getDrinks11()
        val deserts = getDeserts11()
        val others = getOthers11()
        val menus = getMenu11()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals12(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal12()
        val drinks = getDrinks12()
        val deserts = getDeserts12()
        val others = getOthers12()
        val menus = getMenu12()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals13(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal13()
        val drinks = getDrinks13()
        val deserts = getDeserts13()
        val others = getOthers13()
        val menus = getMenu13()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals14(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal14()
        val drinks = getDrinks14()
        val deserts = getDeserts14()
        val others = getOthers14()
        val menus = getMenu14()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals15(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal15()
        val drinks = getDrinks15()
        val deserts = getDeserts15()
        val others = getOthers15()
        val menus = getMenu15()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals16(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal16()
        val drinks = getDrinks16()
        val deserts = getDeserts16()
        val others = getOthers16()
        val menus = getMenu16()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals17(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal17()
        val drinks = getDrinks17()
        val deserts = getDeserts17()
        val others = getOthers17()
        val menus = getMenu17()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals18(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal18()
        val drinks = getDrinks18()
        val deserts = getDeserts18()
        val others = getOthers18()
        val menus = getMenu18()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals19(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal19()
        val drinks = getDrinks19()
        val deserts = getDeserts19()
        val others = getOthers19()
        val menus = getMenu19()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals20(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal20()
        val drinks = getDrinks20()
        val deserts = getDeserts20()
        val others = getOthers20()
        val menus = getMenu20()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals21(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal21()
        val drinks = getDrinks21()
        val deserts = getDeserts21()
        val others = getOthers21()
        val menus = getMenu21()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }

    private fun getListOfMeals22(withMenus: Boolean = true): List<Food> {
        val additionalMeals = getAdditionMeal22()
        val drinks = getDrinks22()
        val deserts = getDeserts22()
        val others = getOthers22()
        val menus = getMenu22()

        return if (withMenus) listOf(menus, additionalMeals, deserts, drinks, others)
        else listOf(additionalMeals, deserts, drinks, others)
    }
}