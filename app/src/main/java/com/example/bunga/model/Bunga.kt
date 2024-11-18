package com.example.bunga.model

import androidx.annotation.DrawableRes
import com.example.bunga.R

data class Bunga(
    val name: String,
    val description: String,
    @DrawableRes
    val image: Int
) {

    companion object {
        fun getBungaById(id: Int): Bunga? {
            return list.find { it.image == id }
        }

        val popularList = listOf(
            Bunga(
                name = "Mawar (Rosa)",
                description = "Arti: Cinta, keindahan, dan penghargaan. Mawar merah sering melambangkan cinta yang mendalam, sedangkan mawar putih melambangkan kesucian dan kebersihan hati.",
                image = R.drawable.mawar
            ),
            Bunga(
                name = "Anggrek (Orchidaceae)",
                description = "Arti: Kekuatan, kecantikan eksotis, dan keabadian. Anggrek juga sering melambangkan kepercayaan diri dan kekayaan.",
                image = R.drawable.anggrek
            ),
            Bunga(
                name = "Dandelion (Taraxacum)",
                description = "Arti: Harapan, kebebasan, dan penyebaran. Dandelion melambangkan keberanian untuk memulai hal baru dan harapan akan masa depan yang cerah.",
                image = R.drawable.dandelion
            ),
        )

        val favoriteList = listOf(
            Bunga(
                name = "Lili (Lilium)",
                description = "Arti: Kecantikan, kemurnian, dan kesucian. Lili putih melambangkan keindahan yang murni, sementara lili oranye melambangkan gairah dan semangat.",
                image = R.drawable.lily
            ),
            Bunga(
                name = "Bunga Matahari (Helianthus annuus)",
                description = "Arti: Kegembiraan, harapan, dan kesetiaan. Bunga matahari juga melambangkan energi positif dan optimisme.",
                image = R.drawable.bunga_matahari
            ),
            Bunga(
                name = "Melati (Jasminum sambac)",
                description = "Arti: Kecantikan, kesucian, dan kehormatan. Melati juga sering dikaitkan dengan cinta yang murni.",
                image = R.drawable.jasmine
            ),
            Bunga(
                name = "Tulip (Tulipa)",
                description = "Arti: Cinta sempurna. Tulip merah melambangkan cinta yang mendalam, sedangkan tulip kuning melambangkan kebahagiaan dan persahabatan.",
                image = R.drawable.tulip
            ),
        )

        val list = listOf(
            Bunga(
                name = "Mawar (Rosa)",
                description = "Arti: Cinta, keindahan, dan penghargaan. Mawar merah sering melambangkan cinta yang mendalam, sedangkan mawar putih melambangkan kesucian dan kebersihan hati.",
                image = R.drawable.mawar
            ),
            Bunga(
                name = "Lili (Lilium)",
                description = "Arti: Kecantikan, kemurnian, dan kesucian. Lili putih melambangkan keindahan yang murni, sementara lili oranye melambangkan gairah dan semangat.",
                image = R.drawable.lily
            ),
            Bunga(
                name = "Melati (Jasminum sambac)",
                description = "Arti: Kecantikan, kesucian, dan kehormatan. Melati juga sering dikaitkan dengan cinta yang murni.",
                image = R.drawable.jasmine
            ),
            Bunga(
                name = "Tulip (Tulipa)",
                description = "Arti: Cinta sempurna. Tulip merah melambangkan cinta yang mendalam, sedangkan tulip kuning melambangkan kebahagiaan dan persahabatan.",
                image = R.drawable.tulip
            ),
            Bunga(
                name = "Anggrek (Orchidaceae)",
                description = "Arti: Kekuatan, kecantikan eksotis, dan keabadian. Anggrek juga sering melambangkan kepercayaan diri dan kekayaan.",
                image = R.drawable.anggrek
            ),
            Bunga(
                name = "Bunga Matahari (Helianthus annuus)",
                description = "Arti: Kegembiraan, harapan, dan kesetiaan. Bunga matahari juga melambangkan energi positif dan optimisme.",
                image = R.drawable.bunga_matahari
            ),
            Bunga(
                name = "Bunga Sakura (Prunus serrulata)",
                description = "Arti: Kecantikan yang sementara, keindahan hidup, dan pencerahan. Sakura melambangkan keindahan yang bersifat sementara dan harapan akan masa depan.",
                image = R.drawable.sakura
            ),
            Bunga(
                name = "Bougainvillea (Bougainvillea spectabilis)",
                description = "Arti: Keindahan yang luas, semangat, dan keberanian. Bunga ini sering melambangkan kekuatan dalam menghadapi tantangan.",
                image = R.drawable.bougainvillea
            ),
            Bunga(
                name = "Krisan (Chrysanthemum)",
                description = "Arti: Kehormatan, keabadian, dan kebahagiaan. Di Jepang, krisan juga melambangkan kedamaian dan ketenangan.",
                image = R.drawable.krisan
            ),
            Bunga(
                name = "Bunga Teratai (Nymphaea)",
                description = "Arti: Kecantikan yang murni dan kegelapan, kesucian, dan spiritualitas. Teratai juga sering melambangkan kelangkahan dan pencerahan.",
                image = R.drawable.teratai
            ),
            Bunga(
                name = "Gerbera (Gerbera jamesonii)",
                description = "Arti: Kegembiraan, kebahagiaan, dan keindahan yang cerah. Gerbera juga sering dikaitkan dengan semangat positif dan optimisme.",
                image = R.drawable.garbera
            ),
            Bunga(
                name = "Lavender (Lavandula)",
                description = "Arti: Ketenangan, kedamaian, dan kebersihan. Lavender sering dikaitkan dengan perasaan damai dan penghargaan.",
                image = R.drawable.lavender
            ),
            Bunga(
                name = "Bunga Camelia (Camellia)",
                description = "Arti: Keindahan, kesucian, dan ketulusan. Camelia juga sering melambangkan cinta dan kasih sayang.",
                image = R.drawable.camelia
            ),
            Bunga(
                name = "Petunia (Petunia hybrida)",
                description = "Arti: Persahabatan, keindahan, dan rasa syukur. Petunia juga sering melambangkan ketenangan dan kedamaian.",
                image = R.drawable.petunia
            ),
            Bunga(
                name = "Daffodil (Narcissus)",
                description = "Arti: Harapan, kebangkitan, dan keabadian. Daffodil melambangkan awal baru dan optimisme untuk masa depan.",
                image = R.drawable.daffodil
            ),
            Bunga(
                name = "Violet (Viola)",
                description = "Arti: Kesetiaan, kesucian, dan cinta yang mendalam. Violet sering melambangkan perasaan hati yang dalam dan setia.",
                image = R.drawable.violet
            ),
            Bunga(
                name = "Azalea (Rhododendron)",
                description = "Arti: Kecantikan yang lembut, kelembutan, dan kebahagiaan. Azalea juga sering melambangkan kesuburan dan kehidupan yang penuh semangat.",
                image = R.drawable.azalea
            ),
            Bunga(
                name = "Gardenia (Gardenia jasminoides)",
                description = "Arti: Kecantikan, kemurnian, dan keanggunan. Gardenia sering melambangkan cinta yang tulus dan penghargaan terhadap orang yang terhormat.",
                image = R.drawable.gardenia
            ),
            Bunga(
                name = "Bunga Kamboja (Plumeria)",
                description = "Arti: Kedamaian, kecantikan, dan kehidupan abadi. Kamboja sering dikaitkan dengan ketenangan dan spiritualitas.",
                image = R.drawable.kamboja
            ),
            Bunga(
                name = "Begonia (Begonia)",
                description = "Arti: Simpati, keindahan yang anggun, dan persahabatan. Begonia melambangkan perhatian dan pengertian terhadap orang lain.",
                image = R.drawable.begonia
            ),
            Bunga(
                name = "Zinnia (Zinnia elegans)",
                description = "Arti: Persahabatan, kegembiraan, dan ketahanan. Zinnia melambangkan hubungan yang kuat dan kebahagiaan yang berlanjut lama.",
                image = R.drawable.zinnia
            ),
            Bunga(
                name = "Chamomile (Matricaria chamomilla)",
                description = "Arti: Ketenangan, kedamaian, dan penyembuhan. Chamomile sering dikaitkan dengan ketenangan hati dan penyembuhan emosional.",
                image = R.drawable.chamomile
            ),
            Bunga(
                name = "Hibiscus (Hibiscus rosa-sinensis)",
                description = "Arti: Keindahan yang eksotis, kesegaraan, dan kehormatan. Hibiscus melambangkan daya tarik yang kuat dan sering diasosiasikan dengan keberanian.",
                image = R.drawable.hibiscus
            ),
            Bunga(
                name = "Poppy (Papaver somniferum)",
                description = "Arti: Kedamaian, kenangan, dan tidur yang tenang. Poppy sering dikaitkan dengan kenangan akan orang yang telah meninggal, serta ketenangan dan kedamaian.",
                image = R.drawable.poppy
            ),
            Bunga(
                name = "Dandelion (Taraxacum)",
                description = "Arti: Harapan, kebebasan, dan penyebaran. Dandelion melambangkan keberanian untuk memulai hal baru dan harapan akan masa depan yang cerah.",
                image = R.drawable.dandelion
            ),
            Bunga(
                name = "Freesia (Freesia refracta)",
                description = "Arti: Kebahagiaan, persahabatan, dan kebahagiaan. Freesia melambangkan rasa percaya diri, kegembiraan, dan kemurnian hati.",
                image = R.drawable.freesia
            ),
            Bunga(
                name = "Bunga Carnation (Dianthus caryophyllus)",
                description = "Arti: Cinta, kebanggaan, dan perasaan yang tulus. Carnation merah melambangkan cinta yang mendalam, sementara yang putih melambangkan kesucian.",
                image = R.drawable.carnation
            ),
            Bunga(
                name = "Aster (Aster amellus)",
                description = "Arti: Cinta, elegans, dan kehormatan. Aster juga sering dikaitkan dengan keberanian dan simbol keindahan.",
                image = R.drawable.aster
            ),
            Bunga(
                name = "Primrose (Primula vulgaris)",
                description = "Arti: Kegembiraan, cinta pertama, dan harapan. Primrose melambangkan perasaan cinta yang pertama kali tumbuh, serta harapan akan kebahagiaan.",
                image = R.drawable.primrose
            ),
            Bunga(
                name = "Fuchsia (Fuchsia spp.)",
                description = "Arti: Cinta yang sempurna, kelembutan, dan keindahan. Fuchsia melambangkan cinta yang tulus dan perasaan yang mendalam terhadap sesorang.",
                image = R.drawable.fuschia
            )
        )
    }
}