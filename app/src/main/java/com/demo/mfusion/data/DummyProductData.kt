package com.demo.mfusion.data

object DummyProductData {

    const val FAKE_NETWORK_DELAY = 500L
    // Variables to the products
    //productName: String,
    //productDescription: String,
    //productImage: String,
    //price: Double,
    //quantity: Int=0


    val products = arrayOf(
        Product(
            1,
            "Hong Kong Box",
            "Egg noodles, battered chicken & vegetable, stir fried in hong kong sauce with coriander on the top; Mild",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2019%2F08%2F05%2F17%2F56%2Fnoodles-4386591__340.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fchinese%2520noodles%2F&tbnid=0NLdYo2VGsSb4M&vet=12ahUKEwjMyta1oqPtAhUYWBUIHWpRDawQMygHegUIARDaAQ..i&docid=bDQxjh_xrdPumM&w=510&h=340&q=noodles%20Hong%20Kong%20Box&hl=pt-PT&ved=2ahUKEwjMyta1oqPtAhUYWBUIHWpRDawQMygHegUIARDaAQ",
            8.20),

        Product(
            2,
            "Szechuan Pepper Box",
            "Egg noodles, battered chicken & vegetable, stir fried in szechuan pepper sauce with coriander on the top",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fsnappygoat.com%2Fb%2F460aa3c58451355734a03535e4332856d7a39c40&imgrefurl=https%3A%2F%2Fsnappygoat.com%2Fs%2F%3Fq%3Dchinese%2Bfood&tbnid=cVzSGWL50_0TQM&vet=12ahUKEwiVtcuGp6PtAhWIQRUIHXdyBegQMygQegQIARB0..i&docid=60fLzFZhPMNLKM&w=910&h=512&itg=1&q=Szechuan%20Pepper%20Box&hl=pt-PT&ved=2ahUKEwiVtcuGp6PtAhWIQRUIHXdyBegQMygQegQIARB0",
            8.20),

        Product(
            3,
            "Phad Thai Box",
            "Rice noodle with a choice of meat, stir fried with vegetables in phad thai sauce; Served with lemon, peanuts & coriander on top",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2019%2F03%2F04%2F12%2F59%2Fpad-thai-4034040__340.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fphotos%2Fsearch%2Fthai%2F&tbnid=0_n0i1FvdBcDCM&vet=12ahUKEwjR65LYp6PtAhUJYBUIHTlPDBkQMygBegUIARDIAQ..i&docid=0g3vJRAcmZq1rM&w=510&h=340&q=pad%20thai%20box&hl=pt-PT&ved=2ahUKEwjR65LYp6PtAhUJYBUIHTlPDBkQMygBegUIARDIAQ",
            6.80),

        Product(
            4,
            "Thai Red Curry",
            "Red curry paste, coconut milk, onions, bamboo shoots, fine beans & sweet basil. Medium. Served with boiled rice or chips",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2019%2F03%2F22%2F18%2F25%2Ffood-4073884__340.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fphotos%2Fsearch%2Fcurry%2520rice%2F&tbnid=mKnSbmBGLqsFKM&vet=12ahUKEwioj6etqKPtAhUjQBUIHYBHAHcQMygaegUIARCTAg..i&docid=_O7KLnfPdNo01M&w=453&h=340&q=Thai%20Red%20Curry&hl=pt-PT&ved=2ahUKEwioj6etqKPtAhUjQBUIHYBHAHcQMygaegUIARCTAg",
            8.20),

        Product(
            5,
            "Thai Green Curry",
            "Green curry paste, coconut milk, onions, bamboo shoots, fine beans & sweet basil; Served with boiled rice or chips",
            "https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.disneyfoodblog.com%2Fwp-content%2Fuploads%2F2014%2F11%2Faulani-AmaAma-Dinner-Entree-ThaiCurry-Close-001.jpg&imgrefurl=https%3A%2F%2Fwww.disneyfoodblog.com%2F2015%2F04%2F24%2Freview-ama-ama-dinner-at-disneys-aulani-resort%2F&tbnid=-poxRVLX6hJyGM&vet=12ahUKEwi-1N7TqKPtAhVkSBUIHU8oA0IQMyg3egQIARA-..i&docid=PbwxO3ZPAut5IM&w=800&h=534&q=Thai%20Green%20Curry&hl=pt-PT&ved=2ahUKEwi-1N7TqKPtAhVkSBUIHU8oA0IQMyg3egQIARA-",
            8.20),

        Product(
            6,
            "House Special Fried Rice with Sauce",
            "Served with BBQ sauce",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fp1.pxfuel.com%2Fpreview%2F644%2F111%2F620%2Fshrimp-rice-peppers-pot.jpg&imgrefurl=https%3A%2F%2Fwww.pxfuel.com%2Fen%2Fsearch%3Fq%3Dbrown%2Brice&tbnid=NhOarZVto7-bbM&vet=12ahUKEwjbyt2wrqPtAhX3YxUIHQbqDdQQMygxegUIARDYAg..i&docid=v0k18diAcr8hhM&w=910&h=617&q=House%20Special%20Fried%20Rice%20with%20Sauce&hl=pt-PT&ved=2ahUKEwjbyt2wrqPtAhX3YxUIHQbqDdQQMygxegUIARDYAg",
            8.80),

        Product(
            7,
            "Roast Pork Fried Rice",
            "Served with parsley, lime, slice, on side, chicken, grilled, bbq, roast, garlic",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fi2.pickpik.com%2Fphotos%2F925%2F5%2F255%2Fchinese-chinese-food-food-hawker-preview.jpg&imgrefurl=https%3A%2F%2Fwww.pickpik.com%2Froast-pork-cast-iron-pan-parsley-lime-slice-on-side-91600&tbnid=vH_Eie06X9LLHM&vet=12ahUKEwir-9KWr6PtAhWSahUIHVBxAUAQMygfegUIARCiAg..i&docid=GKk0kK5OMEOzNM&w=728&h=485&itg=1&q=Roast%20Pork%20Fried%20Rice&hl=pt-PT&ved=2ahUKEwir-9KWr6PtAhWSahUIHVBxAUAQMygfegUIARCiAg",
            7.60),

        Product(
            8,
            "King Prawn Fried Rice",
            "Served with parsley, lime, slice, on side, chicken, grilled, bbq, roast, garlic",
            "https://c.pxhere.com/photos/9a/74/food_thai_cuisine_delicious-1041321.jpg!d",
            8.20),

        Product(
            9,
            "Beer Corona",
            "0.33L",
            "https://commons.wikimedia.org/wiki/File:Corona_Extra_beer_bottle_(2019).png",
            4.50),

        Product(
            10,
            "Beer Stela Artois",
            "0.33L",
            "https://commons.wikimedia.org/wiki/File:StellaGlobalBottle-NoReflection-master-cerveza-bavaria.png",
            4.50),

        Product(
            11,
            "Beer Chang",
            "0.33L",
            "https://upload.wikimedia.org/wikipedia/commons/1/15/Chang_Beer_320ml.jpg",
            4.50),

        Product(
            12,
            "Soft drink Coca",
            "0.33L",
            "https://sc02.alicdn.com/kf/UTB8WvrFHqrFXKJk43Ovq6ybnpXaR.jpg",
            1.20),

        Product(
            13,
            "Soft drink Fanta",
            "0.33L",
            "https://sc02.alicdn.com/kf/UTB8WvrFHqrFXKJk43Ovq6ybnpXaR.jpg",
            1.20),

        Product(
            14,
            "Soft drink Sprite",
            "0.33L",
            "https://sc02.alicdn.com/kf/UTB8WvrFHqrFXKJk43Ovq6ybnpXaR.jpg",
            1.20),

        Product(
            15,
            "Water",
            "Pure Irish water",
            "https://images.hollandandbarrettimages.co.uk/productimages/HB/724/094516_A.jpg",
            1.50)

    )
}
