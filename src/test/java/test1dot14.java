import kaptainwutax.biomeutils.source.OverworldBiomeSource;
import kaptainwutax.seedutils.mc.MCVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1dot14 {
    public int[][] base = {{171, 497, 3},{69, 130, 3},{412, 107, 0},{35, 168, 3},{233, 337, 0},{510, 409, 3},{92, 263, 4},{223, 262, 2},{201, 226, 0},{54, 44, 2},{221, 439, 1},{234, 47, 0},{392, 313, 0},{506, 263, 2},{53, 351, 1},{269, 216, 3},{71, 494, 1},{44, 291, 24},{451, 285, 1},{457, 131, 2},{241, 52, 1},{326, 300, 4},{163, 334, 3},{86, 284, 3},{407, 218, 3},{121, 398, 3},{158, 273, 3},{213, 81, 0},{76, 431, 2},{76, 220, 2},{164, 252, 24},{342, 426, 3},{342, 307, 2},{446, 426, 2},{411, 428, 0},{379, 436, 2},{488, 116, 0},{278, 201, 2},{157, 355, 1},{199, 377, 3},{30, 37, 2},{15, 325, 4},{295, 498, 0},{332, 477, 2},{493, 256, 1},{203, 121, 0},{158, 272, 2},{93, 150, 3},{479, 229, 2},{287, 9, 2},{151, 297, 3},{50, 491, 4},{3, 308, 2307},{304, 461, 1539},{202, 470, 3},{234, 397, 0},{334, 115, 2},{15, 47, 1},{91, 311, 3},{92, 420, 2},{460, 120, 1},{14, 232, 2},{44, 164, 3},{309, 315, 1},{121, 503, 4},{505, 430, 24},{324, 345, 0},{135, 320, 3},{109, 444, 1},{204, 202, 3},{267, 278, 0},{401, 125, 4},{507, 369, 0},{214, 120, 0},{297, 274, 24},{499, 504, 1},{504, 373, 3},{286, 364, 3},{0, 229, 0},{149, 429, 2},{232, 272, 0},{209, 207, 3},{382, 458, 1},{429, 395, 0},{506, 500, 0},{41, 188, 1},{472, 477, 3},{9, 95, 3329},{501, 483, 1},{168, 336, 3},{270, 480, 0},{369, 365, 2},{253, 318, 2},{486, 53, 771},{151, 372, 3},{364, 75, 24},{232, 293, 770},{48, 186, 3},{134, 177, 1},{220, 208, 0},{329, 462, 3},{303, 384, 2},{145, 426, 3},{32, 225, 0},{468, 505, 1},{152, 20, 0},{501, 344, 1},{37, 314, 4},{421, 73, 1},{321, 218, 0},{251, 335, 2},{417, 366, 1},{58, 447, 3},{139, 41, 0},{494, 160, 4},{30, 471, 1},{363, 172, 2},{24, 149, 2},{489, 84, 3},{219, 76, 0},{130, 469, 24},{187, 10, 0},{372, 258, 1},{431, 64, 2051},{441, 496, 1},{381, 408, 4},{23, 329, 3},{507, 6, 24},{237, 511, 1},{1, 148, 0},{93, 8, 3},{395, 482, 24},{509, 426, 0},{283, 273, 2},{364, 424, 2},{210, 493, 2},{380, 316, 4},{161, 401, 1},{88, 264, 3},{340, 437, 4},{185, 416, 2},{121, 77, 24},{426, 276, 2},{49, 10, 24},{216, 327, 2},{212, 394, 4},{306, 399, 2},{493, 133, 1},{442, 485, 3},{48, 486, 0},{286, 34, 1},{313, 220, 1539},{206, 386, 3},{289, 472, 0},{411, 87, 2},{308, 103, 0},{400, 111, 3330},{65, 57, 3},{470, 480, 3},{40, 473, 3},{344, 155, 24},{443, 263, 0},{510, 62, 2},{466, 161, 1027},{146, 433, 2},{465, 351, 1},{49, 428, 24},{140, 40, 2},{462, 159, 0},{100, 29, 3},{423, 269, 2},{113, 429, 3},{62, 52, 3},{316, 386, 2},{66, 391, 3},{346, 371, 2},{63, 442, 0},{247, 467, 2},{215, 121, 1},{511, 387, 0},{46, 446, 0},{459, 230, 0},{478, 379, 2},{497, 356, 2},{388, 128, 4},{323, 352, 3},{247, 64, 0},{316, 242, 3},{130, 251, 0},{226, 370, 2},{476, 332, 1},{358, 151, 3},{262, 218, 2},{303, 214, 0},{139, 201, 3},{87, 285, 0},{502, 306, 4},{281, 7, 1},{332, 501, 2},{56, 152, 0},{475, 386, 2},{234, 425, 24},{279, 21, 1},{456, 231, 2},{122, 3, 1},{503, 131, 1},{52, 307, 24},{198, 196, 1},{302, 38, 0},{284, 126, 0},{418, 386, 2},{39, 109, 24},{400, 438, 1},{456, 438, 0},{412, 430, 0},{399, 143, 2},{132, 289, 2},{456, 449, 3},{243, 292, 0},{309, 338, 3},{61, 282, 2},{341, 292, 3},{366, 225, 1},{186, 27, 3},{233, 482, 4},{250, 287, 1},{326, 45, 1},{220, 251, 0},{213, 113, 1},{482, 220, 2},{261, 116, 24},{214, 141, 2},{146, 477, 24},{198, 118, 0},{397, 54, 2},{338, 130, 0},{368, 374, 0},{67, 67, 3},{466, 274, 2},{338, 34, 0},{240, 71, 3},{203, 334, 1795},{254, 465, 1},{35, 128, 2},{70, 246, 3},{107, 284, 1},{20, 370, 2},{421, 97, 3},{469, 331, 3},{455, 96, 2},{2, 335, 3},{88, 360, 0},{468, 255, 3},{332, 154, 2},{499, 166, 3},{164, 365, 3},};
    public int[][] biomes = {{171, 497, 0},{69, 130, 0},{412, 107, 27},{35, 168, 1},{233, 337, 3},{510, 409, 3},{92, 263, 0},{223, 262, 3},{201, 226, 0},{54, 44, 29},{221, 439, 6},{234, 47, 35},{392, 313, 0},{506, 263, 0},{53, 351, 3},{269, 216, 3},{71, 494, 5},{44, 291, 0},{451, 285, 24},{457, 131, 12},{241, 52, 29},{326, 300, 0},{163, 334, 3},{86, 284, 3},{407, 218, 5},{121, 398, 1},{158, 273, 0},{213, 81, 5},{76, 431, 4},{76, 220, 6},{164, 252, 0},{342, 426, 12},{342, 307, 24},{446, 426, 0},{411, 428, 24},{379, 436, 12},{488, 116, 0},{278, 201, 3},{157, 355, 4},{199, 377, 34},{30, 37, 2},{15, 325, 2},{295, 498, 27},{332, 477, 0},{493, 256, 5},{203, 121, 1},{158, 272, 1},{93, 150, 32},{479, 229, 3},{287, 9, 6},{151, 297, 0},{50, 491, 1},{3, 308, 30},{304, 461, 24},{202, 470, 2},{234, 397, 0},{334, 115, 30},{15, 47, 35},{91, 311, 27},{92, 420, 4},{460, 120, 30},{14, 232, 3},{44, 164, 2},{309, 315, 1},{121, 503, 5},{505, 430, 3},{324, 345, 2},{135, 320, 0},{109, 444, 1},{204, 202, 6},{267, 278, 0},{401, 125, 29},{507, 369, 35},{214, 120, 0},{297, 274, 1},{499, 504, 2},{504, 373, 2},{286, 364, 3},{0, 229, 24},{149, 429, 0},{232, 272, 21},{209, 207, 27},{382, 458, 0},{429, 395, 38},{506, 500, 6},{41, 188, 1},{472, 477, 27},{9, 95, 24},{501, 483, 3},{168, 336, 4},{270, 480, 35},{369, 365, 0},{253, 318, 12},{486, 53, 35},{151, 372, 3},{364, 75, 3},{232, 293, 0},{48, 186, 35},{134, 177, 4},{220, 208, 1},{329, 462, 6},{303, 384, 168},{145, 426, 3},{32, 225, 27},{468, 505, 4},{152, 20, 12},{501, 344, 0},{37, 314, 0},{421, 73, 6},{321, 218, 0},{251, 335, 24},{417, 366, 2},{58, 447, 5},{139, 41, 35},{494, 160, 5},{30, 471, 1},{363, 172, 3},{24, 149, 4},{489, 84, 24},{219, 76, 5},{130, 469, 0},{187, 10, 14},{372, 258, 1},{431, 64, 1},{441, 496, 6},{381, 408, 32},{23, 329, 35},{507, 6, 3},{237, 511, 24},{1, 148, 4},{93, 8, 1},{395, 482, 0},{509, 426, 4},{283, 273, 24},{364, 424, 12},{210, 493, 4},{380, 316, 1},{161, 401, 4},{88, 264, 1},{340, 437, 0},{185, 416, 5},{121, 77, 3},{426, 276, 0},{49, 10, 2},{216, 327, 0},{212, 394, 0},{306, 399, 29},{493, 133, 4},{442, 485, 0},{48, 486, 5},{286, 34, 30},{313, 220, 4},{206, 386, 12},{289, 472, 0},{411, 87, 29},{308, 103, 3},{400, 111, 5},{65, 57, 12},{470, 480, 29},{40, 473, 3},{344, 155, 0},{443, 263, 0},{510, 62, 2},{466, 161, 4},{146, 433, 6},{465, 351, 0},{49, 428, 0},{140, 40, 35},{462, 159, 5},{100, 29, 12},{423, 269, 24},{113, 429, 0},{62, 52, 1},{316, 386, 24},{66, 391, 0},{346, 371, 0},{63, 442, 3},{247, 467, 0},{215, 121, 0},{511, 387, 3},{46, 446, 4},{459, 230, 4},{478, 379, 0},{497, 356, 0},{388, 128, 4},{323, 352, 2},{247, 64, 4},{316, 242, 35},{130, 251, 29},{226, 370, 12},{476, 332, 0},{358, 151, 30},{262, 218, 3},{303, 214, 5},{139, 201, 4},{87, 285, 3},{502, 306, 0},{281, 7, 3},{332, 501, 3},{56, 152, 2},{475, 386, 3},{234, 425, 1},{279, 21, 4},{456, 231, 4},{122, 3, 0},{503, 131, 5},{52, 307, 24},{198, 196, 1},{302, 38, 0},{284, 126, 24},{418, 386, 2},{39, 109, 1},{400, 438, 2},{456, 438, 0},{412, 430, 24},{399, 143, 1},{132, 289, 0},{456, 449, 24},{243, 292, 24},{309, 338, 29},{61, 282, 1},{341, 292, 2},{366, 225, 35},{186, 27, 0},{233, 482, 4},{250, 287, 24},{326, 45, 12},{220, 251, 24},{213, 113, 1},{482, 220, 3},{261, 116, 0},{214, 141, 0},{146, 477, 0},{198, 118, 4},{397, 54, 4},{338, 130, 12},{368, 374, 4},{67, 67, 30},{466, 274, 35},{338, 34, 0},{240, 71, 32},{203, 334, 3},{254, 465, 1},{35, 128, 2},{70, 246, 5},{107, 284, 27},{20, 370, 4},{421, 97, 12},{469, 331, 0},{455, 96, 24},{2, 335, 1},{88, 360, 3},{468, 255, 0},{332, 154, 1},{499, 166, 12},{164, 365, 21},};
    public int[][] noise = {{171, 497, 0},{69, 130, 0},{412, 107, 206118},{35, 168, 238355},{233, 337, 110894},{510, 409, 159932},{92, 263, 0},{223, 262, 227272},{201, 226, 0},{54, 44, 230685},{221, 439, 91882},{234, 47, 66132},{392, 313, 0},{506, 263, 0},{53, 351, 246275},{269, 216, 291975},{71, 494, 75390},{44, 291, 0},{451, 285, 182369},{457, 131, 268846},{241, 52, 149936},{326, 300, 0},{163, 334, 66513},{86, 284, 91883},{407, 218, 177054},{121, 398, 34610},{158, 273, 0},{213, 81, 131938},{76, 431, 111132},{76, 220, 254092},{164, 252, 0},{342, 426, 261213},{342, 307, 0},{446, 426, 0},{411, 428, 108932},{379, 436, 161130},{488, 116, 0},{278, 201, 123200},{157, 355, 150102},{199, 377, 122387},{30, 37, 124561},{15, 325, 239148},{295, 498, 227131},{332, 477, 0},{493, 256, 14287},{203, 121, 236613},{158, 272, 38259},{93, 150, 269847},{479, 229, 194956},{287, 9, 163346},{151, 297, 0},{50, 491, 168949},{3, 308, 238213},{304, 461, 256406},{202, 470, 142412},{234, 397, 0},{334, 115, 226560},{15, 47, 18650},{91, 311, 1604},{92, 420, 299604},{460, 120, 85571},{14, 232, 271132},{44, 164, 142276},{309, 315, 123518},{121, 503, 145811},{505, 430, 88106},{324, 345, 154324},{135, 320, 0},{109, 444, 212993},{204, 202, 26842},{267, 278, 0},{401, 125, 140635},{507, 369, 98798},{214, 120, 0},{297, 274, 276590},{499, 504, 44058},{504, 373, 244112},{286, 364, 280104},{0, 229, 190113},{149, 429, 0},{232, 272, 22072},{209, 207, 167606},{382, 458, 0},{429, 395, 226462},{506, 500, 175607},{41, 188, 80950},{472, 477, 83952},{9, 95, 176073},{501, 483, 249893},{168, 336, 73655},{270, 480, 27608},{369, 365, 0},{253, 318, 89468},{486, 53, 278353},{151, 372, 137532},{364, 75, 69856},{232, 293, 0},{48, 186, 115900},{134, 177, 166944},{220, 208, 97296},{329, 462, 223836},{303, 384, 66965},{145, 426, 136578},{32, 225, 197008},{468, 505, 82614},{152, 20, 282431},{501, 344, 0},{37, 314, 0},{421, 73, 282967},{321, 218, 0},{251, 335, 248813},{417, 366, 86209},{58, 447, 244179},{139, 41, 156413},{494, 160, 48821},{30, 471, 185088},{363, 172, 265639},{24, 149, 88340},{489, 84, 79140},{219, 76, 66608},{130, 469, 0},{187, 10, 127586},{372, 258, 18074},{431, 64, 137182},{441, 496, 266296},{381, 408, 245551},{23, 329, 167396},{507, 6, 97324},{237, 511, 21010},{1, 148, 51891},{93, 8, 257477},{395, 482, 0},{509, 426, 88106},{283, 273, 288693},{364, 424, 135424},{210, 493, 259006},{380, 316, 240091},{161, 401, 203917},{88, 264, 18935},{340, 437, 0},{185, 416, 111094},{121, 77, 7055},{426, 276, 0},{49, 10, 296192},{216, 327, 0},{212, 394, 0},{306, 399, 110470},{493, 133, 296594},{442, 485, 0},{48, 486, 103000},{286, 34, 234859},{313, 220, 287599},{206, 386, 88697},{289, 472, 0},{411, 87, 114343},{308, 103, 133831},{400, 111, 64302},{65, 57, 237685},{470, 480, 143453},{40, 473, 125341},{344, 155, 0},{443, 263, 0},{510, 62, 126717},{466, 161, 280100},{146, 433, 79481},{465, 351, 0},{49, 428, 0},{140, 40, 156413},{462, 159, 128731},{100, 29, 161027},{423, 269, 158474},{113, 429, 0},{62, 52, 118394},{316, 386, 56479},{66, 391, 0},{346, 371, 0},{63, 442, 165609},{247, 467, 0},{215, 121, 0},{511, 387, 296586},{46, 446, 196787},{459, 230, 256785},{478, 379, 0},{497, 356, 0},{388, 128, 131466},{323, 352, 293650},{247, 64, 66976},{316, 242, 69744},{130, 251, 290281},{226, 370, 220570},{476, 332, 0},{358, 151, 100435},{262, 218, 156055},{303, 214, 165136},{139, 201, 95775},{87, 285, 91883},{502, 306, 0},{281, 7, 259848},{332, 501, 109311},{56, 152, 126218},{475, 386, 54211},{234, 425, 94503},{279, 21, 47700},{456, 231, 256785},{122, 3, 0},{503, 131, 163977},{52, 307, 101344},{198, 196, 144351},{302, 38, 0},{284, 126, 299511},{418, 386, 214319},{39, 109, 0},{400, 438, 65844},{456, 438, 0},{412, 430, 108932},{399, 143, 148523},{132, 289, 0},{456, 449, 161158},{243, 292, 174039},{309, 338, 45270},{61, 282, 49492},{341, 292, 172762},{366, 225, 169929},{186, 27, 0},{233, 482, 44298},{250, 287, 0},{326, 45, 0},{220, 251, 267723},{213, 113, 27236},{482, 220, 202816},{261, 116, 0},{214, 141, 0},{146, 477, 0},{198, 118, 262440},{397, 54, 64625},{338, 130, 47228},{368, 374, 128131},{67, 67, 153011},{466, 274, 188096},{338, 34, 0},{240, 71, 289576},{203, 334, 42542},{254, 465, 215846},{35, 128, 67929},{70, 246, 243183},{107, 284, 202933},{20, 370, 91643},{421, 97, 58308},{469, 331, 0},{455, 96, 163706},{2, 335, 288915},{88, 360, 4892},{468, 255, 0},{332, 154, 222970},{499, 166, 39687},{164, 365, 50312},};
    public int[][] variants = {{171, 497, 35},{69, 130, 134},{412, 107, 2},{35, 168, 4},{233, 337, 2},{510, 409, 35},{92, 263, 29},{223, 262, 163},{201, 226, 36},{54, 44, 33},{221, 439, 2},{234, 47, 27},{392, 313, 2},{506, 263, 2},{53, 351, 6},{269, 216, 1},{71, 494, 4},{44, 291, 6},{451, 285, 35},{457, 131, 130},{241, 52, 27},{326, 300, 35},{163, 334, 35},{86, 284, 35},{407, 218, 1},{121, 398, 4},{158, 273, 35},{213, 81, 27},{76, 431, 1},{76, 220, 1},{164, 252, 163},{342, 426, 2},{342, 307, 1},{446, 426, 36},{411, 428, 2},{379, 436, 2},{488, 116, 1},{278, 201, 132},{157, 355, 36},{199, 377, 35},{30, 37, 32},{15, 325, 6},{295, 498, 2},{332, 477, 35},{493, 256, 39},{203, 121, 35},{158, 272, 35},{93, 150, 29},{479, 229, 37},{287, 9, 4},{151, 297, 35},{50, 491, 27},{3, 308, 6},{304, 461, 17},{202, 470, 2},{234, 397, 2},{334, 115, 35},{15, 47, 32},{91, 311, 6},{92, 420, 4},{460, 120, 130},{14, 232, 3},{44, 164, 4},{309, 315, 35},{121, 503, 28},{505, 430, 1},{324, 345, 2},{135, 320, 35},{109, 444, 35},{204, 202, 29},{267, 278, 36},{401, 125, 130},{507, 369, 35},{214, 120, 1},{297, 274, 36},{499, 504, 2},{504, 373, 35},{286, 364, 35},{0, 229, 34},{149, 429, 35},{232, 272, 163},{209, 207, 35},{382, 458, 2},{429, 395, 36},{506, 500, 2},{41, 188, 4},{472, 477, 164},{9, 95, 33},{501, 483, 35},{168, 336, 35},{270, 480, 17},{369, 365, 17},{253, 318, 36},{486, 53, 35},{151, 372, 35},{364, 75, 36},{232, 293, 35},{48, 186, 4},{134, 177, 129},{220, 208, 35},{329, 462, 35},{303, 384, 2},{145, 426, 35},{32, 225, 29},{468, 505, 35},{152, 20, 27},{501, 344, 35},{37, 314, 6},{421, 73, 1},{321, 218, 1},{251, 335, 35},{417, 366, 35},{58, 447, 1},{139, 41, 3},{494, 160, 130},{30, 471, 1},{363, 172, 1},{24, 149, 1},{489, 84, 35},{219, 76, 27},{130, 469, 27},{187, 10, 27},{372, 258, 1},{431, 64, 4},{441, 496, 36},{381, 408, 17},{23, 329, 3},{507, 6, 2},{237, 511, 35},{1, 148, 18},{93, 8, 33},{395, 482, 2},{509, 426, 1},{283, 273, 36},{364, 424, 2},{210, 493, 2},{380, 316, 2},{161, 401, 35},{88, 264, 29},{340, 437, 2},{185, 416, 36},{121, 77, 3},{426, 276, 2},{49, 10, 33},{216, 327, 2},{212, 394, 36},{306, 399, 2},{493, 133, 1},{442, 485, 35},{48, 486, 27},{286, 34, 4},{313, 220, 1},{206, 386, 36},{289, 472, 2},{411, 87, 17},{308, 103, 35},{400, 111, 130},{65, 57, 33},{470, 480, 35},{40, 473, 1},{344, 155, 35},{443, 263, 2},{510, 62, 36},{466, 161, 130},{146, 433, 35},{465, 351, 35},{49, 428, 3},{140, 40, 3},{462, 159, 130},{100, 29, 33},{423, 269, 2},{113, 429, 1},{62, 52, 33},{316, 386, 1},{66, 391, 3},{346, 371, 2},{63, 442, 1},{247, 467, 2},{215, 121, 1},{511, 387, 36},{46, 446, 1},{459, 230, 2},{478, 379, 36},{497, 356, 35},{388, 128, 130},{323, 352, 1},{247, 64, 17},{316, 242, 132},{130, 251, 1},{226, 370, 35},{476, 332, 35},{358, 151, 1},{262, 218, 35},{303, 214, 1},{139, 201, 129},{87, 285, 35},{502, 306, 35},{281, 7, 4},{332, 501, 35},{56, 152, 134},{475, 386, 35},{234, 425, 2},{279, 21, 4},{456, 231, 17},{122, 3, 32},{503, 131, 1},{52, 307, 6},{198, 196, 29},{302, 38, 4},{284, 126, 35},{418, 386, 35},{39, 109, 133},{400, 438, 35},{456, 438, 35},{412, 430, 2},{399, 143, 2},{132, 289, 35},{456, 449, 35},{243, 292, 35},{309, 338, 35},{61, 282, 29},{341, 292, 1},{366, 225, 1},{186, 27, 27},{233, 482, 17},{250, 287, 36},{326, 45, 18},{220, 251, 163},{213, 113, 1},{482, 220, 37},{261, 116, 35},{214, 141, 35},{146, 477, 35},{198, 118, 35},{397, 54, 1},{338, 130, 35},{368, 374, 17},{67, 67, 19},{466, 274, 35},{338, 34, 18},{240, 71, 2},{203, 334, 2},{254, 465, 2},{35, 128, 1},{70, 246, 29},{107, 284, 36},{20, 370, 3},{421, 97, 130},{469, 331, 35},{455, 96, 130},{2, 335, 6},{88, 360, 1},{468, 255, 2},{332, 154, 35},{499, 166, 130},{164, 365, 35},};
    public int[][] river = {{171, 497, -1},{69, 130, -1},{412, 107, -1},{35, 168, -1},{233, 337, -1},{510, 409, -1},{92, 263, -1},{223, 262, -1},{201, 226, -1},{54, 44, -1},{221, 439, -1},{234, 47, -1},{392, 313, -1},{506, 263, -1},{53, 351, -1},{269, 216, -1},{71, 494, -1},{44, 291, -1},{451, 285, -1},{457, 131, -1},{241, 52, -1},{326, 300, -1},{163, 334, -1},{86, 284, -1},{407, 218, -1},{121, 398, -1},{158, 273, -1},{213, 81, -1},{76, 431, -1},{76, 220, -1},{164, 252, -1},{342, 426, -1},{342, 307, -1},{446, 426, -1},{411, 428, -1},{379, 436, -1},{488, 116, -1},{278, 201, 7},{157, 355, -1},{199, 377, -1},{30, 37, -1},{15, 325, 7},{295, 498, -1},{332, 477, 7},{493, 256, -1},{203, 121, -1},{158, 272, -1},{93, 150, -1},{479, 229, -1},{287, 9, -1},{151, 297, -1},{50, 491, -1},{3, 308, -1},{304, 461, -1},{202, 470, -1},{234, 397, -1},{334, 115, -1},{15, 47, -1},{91, 311, 7},{92, 420, -1},{460, 120, -1},{14, 232, -1},{44, 164, -1},{309, 315, -1},{121, 503, -1},{505, 430, -1},{324, 345, -1},{135, 320, -1},{109, 444, -1},{204, 202, -1},{267, 278, -1},{401, 125, -1},{507, 369, -1},{214, 120, -1},{297, 274, -1},{499, 504, -1},{504, 373, -1},{286, 364, -1},{0, 229, -1},{149, 429, -1},{232, 272, -1},{209, 207, -1},{382, 458, -1},{429, 395, -1},{506, 500, -1},{41, 188, -1},{472, 477, 7},{9, 95, -1},{501, 483, -1},{168, 336, -1},{270, 480, -1},{369, 365, -1},{253, 318, -1},{486, 53, -1},{151, 372, -1},{364, 75, -1},{232, 293, -1},{48, 186, -1},{134, 177, -1},{220, 208, -1},{329, 462, -1},{303, 384, -1},{145, 426, -1},{32, 225, -1},{468, 505, -1},{152, 20, -1},{501, 344, -1},{37, 314, -1},{421, 73, -1},{321, 218, -1},{251, 335, -1},{417, 366, -1},{58, 447, -1},{139, 41, -1},{494, 160, -1},{30, 471, -1},{363, 172, -1},{24, 149, -1},{489, 84, -1},{219, 76, -1},{130, 469, -1},{187, 10, -1},{372, 258, -1},{431, 64, -1},{441, 496, -1},{381, 408, -1},{23, 329, -1},{507, 6, -1},{237, 511, -1},{1, 148, -1},{93, 8, -1},{395, 482, -1},{509, 426, -1},{283, 273, -1},{364, 424, -1},{210, 493, -1},{380, 316, -1},{161, 401, -1},{88, 264, -1},{340, 437, -1},{185, 416, -1},{121, 77, -1},{426, 276, -1},{49, 10, -1},{216, 327, -1},{212, 394, -1},{306, 399, -1},{493, 133, -1},{442, 485, -1},{48, 486, -1},{286, 34, -1},{313, 220, -1},{206, 386, -1},{289, 472, -1},{411, 87, -1},{308, 103, -1},{400, 111, -1},{65, 57, -1},{470, 480, -1},{40, 473, -1},{344, 155, -1},{443, 263, 7},{510, 62, -1},{466, 161, -1},{146, 433, -1},{465, 351, -1},{49, 428, -1},{140, 40, -1},{462, 159, -1},{100, 29, -1},{423, 269, -1},{113, 429, -1},{62, 52, -1},{316, 386, -1},{66, 391, -1},{346, 371, -1},{63, 442, -1},{247, 467, -1},{215, 121, -1},{511, 387, -1},{46, 446, -1},{459, 230, -1},{478, 379, -1},{497, 356, -1},{388, 128, -1},{323, 352, -1},{247, 64, -1},{316, 242, -1},{130, 251, -1},{226, 370, -1},{476, 332, -1},{358, 151, -1},{262, 218, -1},{303, 214, -1},{139, 201, -1},{87, 285, -1},{502, 306, -1},{281, 7, -1},{332, 501, -1},{56, 152, -1},{475, 386, -1},{234, 425, -1},{279, 21, -1},{456, 231, -1},{122, 3, -1},{503, 131, -1},{52, 307, -1},{198, 196, -1},{302, 38, -1},{284, 126, -1},{418, 386, -1},{39, 109, -1},{400, 438, -1},{456, 438, -1},{412, 430, -1},{399, 143, -1},{132, 289, -1},{456, 449, -1},{243, 292, -1},{309, 338, -1},{61, 282, -1},{341, 292, -1},{366, 225, -1},{186, 27, -1},{233, 482, -1},{250, 287, -1},{326, 45, -1},{220, 251, -1},{213, 113, -1},{482, 220, -1},{261, 116, -1},{214, 141, -1},{146, 477, -1},{198, 118, -1},{397, 54, 7},{338, 130, -1},{368, 374, -1},{67, 67, -1},{466, 274, -1},{338, 34, -1},{240, 71, -1},{203, 334, -1},{254, 465, -1},{35, 128, -1},{70, 246, -1},{107, 284, -1},{20, 370, -1},{421, 97, -1},{469, 331, -1},{455, 96, -1},{2, 335, -1},{88, 360, -1},{468, 255, -1},{332, 154, -1},{499, 166, -1},{164, 365, -1},};
    public int[][] full ={{171, 497, 35},{69, 130, 134},{412, 107, 2},{35, 168, 4},{233, 337, 2},{510, 409, 35},{92, 263, 29},{223, 262, 163},{201, 226, 36},{54, 44, 33},{221, 439, 2},{234, 47, 27},{392, 313, 2},{506, 263, 2},{53, 351, 6},{269, 216, 1},{71, 494, 4},{44, 291, 6},{451, 285, 35},{457, 131, 130},{241, 52, 27},{326, 300, 35},{163, 334, 35},{86, 284, 35},{407, 218, 1},{121, 398, 4},{158, 273, 35},{213, 81, 27},{76, 431, 1},{76, 220, 1},{164, 252, 163},{342, 426, 2},{342, 307, 1},{446, 426, 36},{411, 428, 2},{379, 436, 2},{488, 116, 1},{278, 201, 7},{157, 355, 36},{199, 377, 35},{30, 37, 32},{15, 325, 7},{295, 498, 2},{332, 477, 7},{493, 256, 39},{203, 121, 35},{158, 272, 35},{93, 150, 29},{479, 229, 37},{287, 9, 4},{151, 297, 35},{50, 491, 27},{3, 308, 6},{304, 461, 17},{202, 470, 2},{234, 397, 2},{334, 115, 35},{15, 47, 32},{91, 311, 7},{92, 420, 4},{460, 120, 130},{14, 232, 3},{44, 164, 4},{309, 315, 35},{121, 503, 28},{505, 430, 1},{324, 345, 2},{135, 320, 35},{109, 444, 35},{204, 202, 29},{267, 278, 36},{401, 125, 130},{507, 369, 35},{214, 120, 1},{297, 274, 36},{499, 504, 2},{504, 373, 35},{286, 364, 35},{0, 229, 34},{149, 429, 35},{232, 272, 163},{209, 207, 35},{382, 458, 2},{429, 395, 36},{506, 500, 2},{41, 188, 4},{472, 477, 7},{9, 95, 33},{501, 483, 35},{168, 336, 35},{270, 480, 17},{369, 365, 17},{253, 318, 36},{486, 53, 35},{151, 372, 35},{364, 75, 36},{232, 293, 35},{48, 186, 4},{134, 177, 129},{220, 208, 35},{329, 462, 35},{303, 384, 2},{145, 426, 35},{32, 225, 29},{468, 505, 35},{152, 20, 27},{501, 344, 35},{37, 314, 6},{421, 73, 1},{321, 218, 1},{251, 335, 35},{417, 366, 35},{58, 447, 1},{139, 41, 3},{494, 160, 130},{30, 471, 1},{363, 172, 1},{24, 149, 1},{489, 84, 35},{219, 76, 27},{130, 469, 27},{187, 10, 27},{372, 258, 1},{431, 64, 4},{441, 496, 36},{381, 408, 17},{23, 329, 3},{507, 6, 2},{237, 511, 35},{1, 148, 18},{93, 8, 33},{395, 482, 2},{509, 426, 1},{283, 273, 36},{364, 424, 2},{210, 493, 2},{380, 316, 2},{161, 401, 35},{88, 264, 29},{340, 437, 2},{185, 416, 36},{121, 77, 3},{426, 276, 2},{49, 10, 33},{216, 327, 2},{212, 394, 36},{306, 399, 2},{493, 133, 1},{442, 485, 35},{48, 486, 27},{286, 34, 4},{313, 220, 1},{206, 386, 36},{289, 472, 2},{411, 87, 17},{308, 103, 35},{400, 111, 130},{65, 57, 33},{470, 480, 35},{40, 473, 1},{344, 155, 35},{443, 263, 7},{510, 62, 36},{466, 161, 130},{146, 433, 35},{465, 351, 35},{49, 428, 3},{140, 40, 3},{462, 159, 130},{100, 29, 33},{423, 269, 2},{113, 429, 1},{62, 52, 33},{316, 386, 1},{66, 391, 3},{346, 371, 2},{63, 442, 1},{247, 467, 2},{215, 121, 1},{511, 387, 36},{46, 446, 1},{459, 230, 2},{478, 379, 36},{497, 356, 35},{388, 128, 130},{323, 352, 1},{247, 64, 17},{316, 242, 132},{130, 251, 1},{226, 370, 35},{476, 332, 35},{358, 151, 1},{262, 218, 35},{303, 214, 1},{139, 201, 129},{87, 285, 35},{502, 306, 35},{281, 7, 4},{332, 501, 35},{56, 152, 134},{475, 386, 35},{234, 425, 2},{279, 21, 4},{456, 231, 17},{122, 3, 32},{503, 131, 1},{52, 307, 6},{198, 196, 29},{302, 38, 4},{284, 126, 35},{418, 386, 35},{39, 109, 133},{400, 438, 35},{456, 438, 35},{412, 430, 2},{399, 143, 2},{132, 289, 35},{456, 449, 35},{243, 292, 35},{309, 338, 35},{61, 282, 29},{341, 292, 1},{366, 225, 1},{186, 27, 27},{233, 482, 17},{250, 287, 36},{326, 45, 18},{220, 251, 163},{213, 113, 1},{482, 220, 37},{261, 116, 35},{214, 141, 35},{146, 477, 35},{198, 118, 35},{397, 54, 7},{338, 130, 35},{368, 374, 17},{67, 67, 19},{466, 274, 35},{338, 34, 18},{240, 71, 2},{203, 334, 2},{254, 465, 2},{35, 128, 1},{70, 246, 29},{107, 284, 36},{20, 370, 3},{421, 97, 130},{469, 331, 35},{455, 96, 130},{2, 335, 6},{88, 360, 1},{468, 255, 2},{332, 154, 35},{499, 166, 130},{164, 365, 35},};
    public int[][] voronoi = {{171, 497, 1},{69, 130, 32},{412, 107, 32},{35, 168, 32},{233, 337, 5},{510, 409, 34},{92, 263, 32},{223, 262, 32},{201, 226, 33},{54, 44, 33},{221, 439, 134},{234, 47, 32},{392, 313, 5},{506, 263, 3},{53, 351, 32},{269, 216, 33},{71, 494, 29},{44, 291, 32},{451, 285, 3},{457, 131, 33},{241, 52, 32},{326, 300, 5},{163, 334, 133},{86, 284, 32},{407, 218, 5},{121, 398, 133},{158, 273, 32},{213, 81, 32},{76, 431, 133},{76, 220, 7},{164, 252, 32},{342, 426, 134},{342, 307, 5},{446, 426, 131},{411, 428, 131},{379, 436, 131},{488, 116, 5},{278, 201, 33},{157, 355, 133},{199, 377, 134},{30, 37, 32},{15, 325, 32},{295, 498, 134},{332, 477, 134},{493, 256, 3},{203, 121, 7},{158, 272, 32},{93, 150, 32},{479, 229, 3},{287, 9, 32},{151, 297, 32},{50, 491, 29},{3, 308, 32},{304, 461, 134},{202, 470, 134},{234, 397, 134},{334, 115, 33},{15, 47, 32},{91, 311, 32},{92, 420, 133},{460, 120, 33},{14, 232, 5},{44, 164, 32},{309, 315, 19},{121, 503, 1},{505, 430, 34},{324, 345, 19},{135, 320, 160},{109, 444, 133},{204, 202, 33},{267, 278, 19},{401, 125, 33},{507, 369, 3},{214, 120, 32},{297, 274, 33},{499, 504, 162},{504, 373, 3},{286, 364, 19},{0, 229, 5},{149, 429, 133},{232, 272, 32},{209, 207, 33},{382, 458, 134},{429, 395, 131},{506, 500, 162},{41, 188, 32},{472, 477, 131},{9, 95, 32},{501, 483, 34},{168, 336, 133},{270, 480, 134},{369, 365, 131},{253, 318, 19},{486, 53, 5},{151, 372, 133},{364, 75, 33},{232, 293, 19},{48, 186, 32},{134, 177, 32},{220, 208, 33},{329, 462, 134},{303, 384, 134},{145, 426, 133},{32, 225, 32},{468, 505, 134},{152, 20, 32},{501, 344, 3},{37, 314, 32},{421, 73, 32},{321, 218, 33},{251, 335, 19},{417, 366, 131},{58, 447, 5},{139, 41, 32},{494, 160, 33},{30, 471, 5},{363, 172, 33},{24, 149, 32},{489, 84, 5},{219, 76, 32},{130, 469, 1},{187, 10, 33},{372, 258, 5},{431, 64, 32},{441, 496, 134},{381, 408, 131},{23, 329, 32},{507, 6, 33},{237, 511, 29},{1, 148, 32},{93, 8, 32},{395, 482, 134},{509, 426, 34},{283, 273, 19},{364, 424, 134},{210, 493, 134},{380, 316, 5},{161, 401, 133},{88, 264, 32},{340, 437, 134},{185, 416, 133},{121, 77, 32},{426, 276, 3},{49, 10, 32},{216, 327, 5},{212, 394, 134},{306, 399, 134},{493, 133, 19},{442, 485, 131},{48, 486, 29},{286, 34, 32},{313, 220, 33},{206, 386, 134},{289, 472, 134},{411, 87, 32},{308, 103, 33},{400, 111, 33},{65, 57, 32},{470, 480, 131},{40, 473, 5},{344, 155, 33},{443, 263, 3},{510, 62, 5},{466, 161, 33},{146, 433, 133},{465, 351, 3},{49, 428, 7},{140, 40, 32},{462, 159, 33},{100, 29, 32},{423, 269, 3},{113, 429, 133},{62, 52, 33},{316, 386, 134},{66, 391, 33},{346, 371, 5},{63, 442, 5},{247, 467, 134},{215, 121, 32},{511, 387, 3},{46, 446, 5},{459, 230, 3},{478, 379, 131},{497, 356, 3},{388, 128, 32},{323, 352, 134},{247, 64, 32},{316, 242, 33},{130, 251, 32},{226, 370, 134},{476, 332, 3},{358, 151, 33},{262, 218, 33},{303, 214, 33},{139, 201, 32},{87, 285, 32},{502, 306, 3},{281, 7, 32},{332, 501, 134},{56, 152, 32},{475, 386, 131},{234, 425, 134},{279, 21, 32},{456, 231, 3},{122, 3, 32},{503, 131, 19},{52, 307, 32},{198, 196, 33},{302, 38, 32},{284, 126, 33},{418, 386, 131},{39, 109, 32},{400, 438, 131},{456, 438, 131},{412, 430, 131},{399, 143, 32},{132, 289, 160},{456, 449, 131},{243, 292, 19},{309, 338, 19},{61, 282, 32},{341, 292, 5},{366, 225, 33},{186, 27, 33},{233, 482, 134},{250, 287, 19},{326, 45, 32},{220, 251, 32},{213, 113, 32},{482, 220, 3},{261, 116, 33},{214, 141, 7},{146, 477, 1},{198, 118, 7},{397, 54, 32},{338, 130, 33},{368, 374, 131},{67, 67, 33},{466, 274, 3},{338, 34, 32},{240, 71, 32},{203, 334, 5},{254, 465, 134},{35, 128, 32},{70, 246, 32},{107, 284, 32},{20, 370, 5},{421, 97, 33},{469, 331, 3},{455, 96, 33},{2, 335, 32},{88, 360, 7},{468, 255, 3},{332, 154, 33},{499, 166, 33},{164, 365, 133},};

    private OverworldBiomeSource overworldBiomeSource;
    private int size;

    @BeforeEach
    public void setup() {
        this.overworldBiomeSource = new OverworldBiomeSource(MCVersion.v1_14_4, 4739724806777789925L);
        this.size = 16;
    }

    @Test
    @DisplayName("Test Biomes against data for 1.14")
    public void testBiomes() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = biomes[i * size + j][0];
                int z = biomes[i * size + j][1];
                int id = overworldBiomeSource.biomes.sample(x, 0, z);
                assertEquals(biomes[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + biomes[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test Noise against data for 1.14")
    public void testNoise() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = noise[i * size + j][0];
                int z = noise[i * size + j][1];
                int id = overworldBiomeSource.noise.sample(x, 0, z);
                assertEquals(noise[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + noise[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test full mixing river with biomes against data for 1.14")
    public void testFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = full[i * size + j][0];
                int z = full[i * size + j][1];
                int id = overworldBiomeSource.full.sample(x, 0, z);
                assertEquals(full[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + full[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test voronoi against data for 1.14")
    public void testVoronoi() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = voronoi[i * size + j][0];
                int z = voronoi[i * size + j][1];
                int id = overworldBiomeSource.voronoi.sample(x, 0, z);
                assertEquals(voronoi[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + voronoi[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test river against data for 1.14")
    public void testRiver() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = river[i * size + j][0];
                int z = river[i * size + j][1];
                int id = overworldBiomeSource.river.sample(x, 0, z);
                assertEquals(river[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + river[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test Variants against data for 1.14")
    public void testVariants() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = variants[i * size + j][0];
                int z = variants[i * size + j][1];
                int id = overworldBiomeSource.variants.sample(x, 0, z);
                assertEquals(variants[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + variants[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test First stack against data for 1.14")
    public void testBase() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = base[i * size + j][0];
                int z = base[i * size + j][1];
                int id = overworldBiomeSource.base.sample(x, 0, z);
                assertEquals(base[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + base[i * size + j][2]);
            }
        }
    }
}


/*
#### OverworldBiomeProvider
 public final Layer genBiomes;

### GenLayer
 public int[] generateBiomes2(int startX, int startZ, int xSize, int zSize) {
      int[] abiome = new int[xSize * zSize];

      for(int i = 0; i < zSize; ++i) {
         for(int j = 0; j < xSize; ++j) {
            int k = this.field_215742_b.getValue(startX + j, startZ + i);
            Biome biome = this.func_215739_a(k);
            abiome[j + i * xSize] = k;
         }
      }

      return abiome;
   }

### Main
Bootstrap.register();
long seed=541515181818L;
WorldSettings worldSettings=new WorldSettings(seed, GameType.ADVENTURE,true,false, WorldType.DEFAULT);
OverworldBiomeProviderSettings overworldBiomeProviderSettings= new OverworldBiomeProviderSettings();
overworldBiomeProviderSettings.setWorldInfo(new WorldInfo(worldSettings,"test"));
OverworldBiomeProvider overworldBiomeProvider=new OverworldBiomeProvider(overworldBiomeProviderSettings);
int size=16;
Random r= new Random(4227552225777L);
System.out.print("{");
for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
        int x = r.nextInt(512);
        int z = r.nextInt(512);
        System.out.printf("{%d, %d, %d},",x,z,overworldBiomeProvider.genBiomes.generateBiomes2(x,z,1,1)[0]);
    }
}
System.out.print("};");
System.out.println();
 */