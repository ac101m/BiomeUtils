package kaptainwutax.v1_4_7;

import kaptainwutax.biomeutils.source.OverworldBiomeSource;
import kaptainwutax.seedutils.mc.MCVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static kaptainwutax.TestFramework.randomBiomeGen;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Overworld {
    public int[][] full = {{171, 497, 21}, {69, 130, 2}, {412, 107, 0}, {35, 168, 2}, {233, 337, 21}, {510, 409, 0}, {92, 263, 2}, {223, 262, 22}, {201, 226, 21}, {54, 44, 7}, {221, 439, 21}, {234, 47, 16}, {392, 313, 1}, {506, 263, 6}, {53, 351, 1}, {269, 216, 5}, {71, 494, 0}, {44, 291, 6}, {451, 285, 0}, {457, 131, 0}, {241, 52, 4}, {326, 300, 6}, {163, 334, 22}, {86, 284, 2}, {407, 218, 0}, {121, 398, 5}, {158, 273, 21}, {213, 81, 7}, {76, 431, 5}, {76, 220, 6}, {164, 252, 7}, {342, 426, 7}, {342, 307, 7}, {446, 426, 2}, {411, 428, 21}, {379, 436, 6}, {488, 116, 0}, {278, 201, 5}, {157, 355, 21}, {199, 377, 22}, {30, 37, 3}, {15, 325, 4}, {295, 498, 6}, {332, 477, 6}, {493, 256, 2}, {203, 121, 0}, {158, 272, 21}, {93, 150, 16}, {479, 229, 6}, {287, 9, 2}, {151, 297, 7}, {50, 491, 0}, {3, 308, 5}, {304, 461, 21}, {202, 470, 21}, {234, 397, 2}, {334, 115, 4}, {15, 47, 6}, {91, 311, 2}, {92, 420, 5}, {460, 120, 0}, {14, 232, 2}, {44, 164, 2}, {309, 315, 1}, {121, 503, 21}, {505, 430, 0}, {324, 345, 6}, {135, 320, 2}, {109, 444, 5}, {204, 202, 6}, {267, 278, 1}, {401, 125, 1}, {507, 369, 0}, {214, 120, 7}, {297, 274, 21}, {499, 504, 1}, {504, 373, 0}, {286, 364, 21}, {0, 229, 5}, {149, 429, 3}, {232, 272, 22}, {209, 207, 6}, {382, 458, 6}, {429, 395, 7}, {506, 500, 1}, {41, 188, 6}, {472, 477, 1}, {9, 95, 17}, {501, 483, 0}, {168, 336, 22}, {270, 480, 5}, {369, 365, 20}, {253, 318, 1}, {486, 53, 0}, {151, 372, 5}, {364, 75, 0}, {232, 293, 21}, {48, 186, 6}, {134, 177, 18}, {220, 208, 7}, {329, 462, 21}, {303, 384, 21}, {145, 426, 3}, {32, 225, 2}, {468, 505, 1}, {152, 20, 0}, {501, 344, 6}, {37, 314, 1}, {421, 73, 0}, {321, 218, 18}, {251, 335, 1}, {417, 366, 21}, {58, 447, 19}, {139, 41, 0}, {494, 160, 0}, {30, 471, 5}, {363, 172, 16}, {24, 149, 2}, {489, 84, 0}, {219, 76, 4}, {130, 469, 3}, {187, 10, 0}, {372, 258, 21}, {431, 64, 16}, {441, 496, 1}, {381, 408, 3}, {23, 329, 1}, {507, 6, 0}, {237, 511, 5}, {1, 148, 1}, {93, 8, 7}, {395, 482, 6}, {509, 426, 0}, {283, 273, 21}, {364, 424, 21}, {210, 493, 6}, {380, 316, 1}, {161, 401, 5}, {88, 264, 2}, {340, 437, 21}, {185, 416, 22}, {121, 77, 0}, {426, 276, 2}, {49, 10, 21}, {216, 327, 21}, {212, 394, 21}, {306, 399, 22}, {493, 133, 0}, {442, 485, 1}, {48, 486, 0}, {286, 34, 6}, {313, 220, 4}, {206, 386, 21}, {289, 472, 6}, {411, 87, 0}, {308, 103, 4}, {400, 111, 16}, {65, 57, 0}, {470, 480, 1}, {40, 473, 0}, {344, 155, 4}, {443, 263, 17}, {510, 62, 0}, {466, 161, 7}, {146, 433, 3}, {465, 351, 16}, {49, 428, 5}, {140, 40, 0}, {462, 159, 7}, {100, 29, 0}, {423, 269, 2}, {113, 429, 20}, {62, 52, 20}, {316, 386, 21}, {66, 391, 1}, {346, 371, 21}, {63, 442, 19}, {247, 467, 7}, {215, 121, 7}, {511, 387, 0}, {46, 446, 19}, {459, 230, 2}, {478, 379, 0}, {497, 356, 6}, {388, 128, 1}, {323, 352, 7}, {247, 64, 4}, {316, 242, 21}, {130, 251, 5}, {226, 370, 21}, {476, 332, 0}, {358, 151, 16}, {262, 218, 5}, {303, 214, 4}, {139, 201, 4}, {87, 285, 2}, {502, 306, 6}, {281, 7, 2}, {332, 501, 6}, {56, 152, 2}, {475, 386, 21}, {234, 425, 21}, {279, 21, 2}, {456, 231, 2}, {122, 3, 0}, {503, 131, 0}, {52, 307, 6}, {198, 196, 6}, {302, 38, 6}, {284, 126, 1}, {418, 386, 7}, {39, 109, 17}, {400, 438, 6}, {456, 438, 2}, {412, 430, 21}, {399, 143, 4}, {132, 289, 21}, {456, 449, 16}, {243, 292, 7}, {309, 338, 6}, {61, 282, 2}, {341, 292, 21}, {366, 225, 0}, {186, 27, 0}, {233, 482, 6}, {250, 287, 7}, {326, 45, 6}, {220, 251, 21}, {213, 113, 0}, {482, 220, 6}, {261, 116, 7}, {214, 141, 16}, {146, 477, 3}, {198, 118, 0}, {397, 54, 0}, {338, 130, 1}, {368, 374, 3}, {67, 67, 7}, {466, 274, 2}, {338, 34, 6}, {240, 71, 4}, {203, 334, 22}, {254, 465, 7}, {35, 128, 2}, {70, 246, 2}, {107, 284, 2}, {20, 370, 1}, {421, 97, 16}, {469, 331, 0}, {455, 96, 0}, {2, 335, 1}, {88, 360, 1}, {468, 255, 2}, {332, 154, 4}, {499, 166, 0}, {164, 365, 7},};
    public int[][] voronoi = {{171, 497, 2}, {69, 130, 6}, {412, 107, 0}, {35, 168, 6}, {233, 337, 2}, {510, 409, 0}, {92, 263, 3}, {223, 262, 20}, {201, 226, 3}, {54, 44, 0}, {221, 439, 2}, {234, 47, 21}, {392, 313, 0}, {506, 263, 0}, {53, 351, 2}, {269, 216, 7}, {71, 494, 17}, {44, 291, 6}, {451, 285, 0}, {457, 131, 0}, {241, 52, 21}, {326, 300, 0}, {163, 334, 2}, {86, 284, 3}, {407, 218, 0}, {121, 398, 2}, {158, 273, 3}, {213, 81, 21}, {76, 431, 2}, {76, 220, 6}, {164, 252, 3}, {342, 426, 2}, {342, 307, 0}, {446, 426, 0}, {411, 428, 0}, {379, 436, 0}, {488, 116, 0}, {278, 201, 16}, {157, 355, 2}, {199, 377, 17}, {30, 37, 6}, {15, 325, 7}, {295, 498, 2}, {332, 477, 7}, {493, 256, 0}, {203, 121, 21}, {158, 272, 3}, {93, 150, 20}, {479, 229, 0}, {287, 9, 22}, {151, 297, 3}, {50, 491, 17}, {3, 308, 6}, {304, 461, 2}, {202, 470, 2}, {234, 397, 2}, {334, 115, 0}, {15, 47, 7}, {91, 311, 3}, {92, 420, 17}, {460, 120, 0}, {14, 232, 7}, {44, 164, 6}, {309, 315, 0}, {121, 503, 2}, {505, 430, 0}, {324, 345, 0}, {135, 320, 3}, {109, 444, 17}, {204, 202, 3}, {267, 278, 7}, {401, 125, 0}, {507, 369, 0}, {214, 120, 21}, {297, 274, 7}, {499, 504, 0}, {504, 373, 0}, {286, 364, 0}, {0, 229, 6}, {149, 429, 17}, {232, 272, 3}, {209, 207, 3}, {382, 458, 0}, {429, 395, 0}, {506, 500, 0}, {41, 188, 6}, {472, 477, 0}, {9, 95, 6}, {501, 483, 0}, {168, 336, 2}, {270, 480, 2}, {369, 365, 0}, {253, 318, 3}, {486, 53, 0}, {151, 372, 2}, {364, 75, 0}, {232, 293, 3}, {48, 186, 6}, {134, 177, 3}, {220, 208, 3}, {329, 462, 2}, {303, 384, 0}, {145, 426, 17}, {32, 225, 6}, {468, 505, 0}, {152, 20, 7}, {501, 344, 0}, {37, 314, 6}, {421, 73, 0}, {321, 218, 0}, {251, 335, 20}, {417, 366, 0}, {58, 447, 2}, {139, 41, 21}, {494, 160, 0}, {30, 471, 7}, {363, 172, 0}, {24, 149, 6}, {489, 84, 0}, {219, 76, 21}, {130, 469, 17}, {187, 10, 21}, {372, 258, 0}, {431, 64, 0}, {441, 496, 0}, {381, 408, 0}, {23, 329, 7}, {507, 6, 0}, {237, 511, 2}, {1, 148, 6}, {93, 8, 21}, {395, 482, 0}, {509, 426, 0}, {283, 273, 7}, {364, 424, 7}, {210, 493, 17}, {380, 316, 0}, {161, 401, 2}, {88, 264, 3}, {340, 437, 2}, {185, 416, 17}, {121, 77, 16}, {426, 276, 0}, {49, 10, 7}, {216, 327, 2}, {212, 394, 17}, {306, 399, 16}, {493, 133, 0}, {442, 485, 0}, {48, 486, 17}, {286, 34, 21}, {313, 220, 0}, {206, 386, 17}, {289, 472, 2}, {411, 87, 0}, {308, 103, 21}, {400, 111, 0}, {65, 57, 0}, {470, 480, 0}, {40, 473, 2}, {344, 155, 0}, {443, 263, 0}, {510, 62, 0}, {466, 161, 0}, {146, 433, 17}, {465, 351, 0}, {49, 428, 2}, {140, 40, 21}, {462, 159, 0}, {100, 29, 16}, {423, 269, 0}, {113, 429, 17}, {62, 52, 0}, {316, 386, 0}, {66, 391, 17}, {346, 371, 0}, {63, 442, 2}, {247, 467, 2}, {215, 121, 21}, {511, 387, 0}, {46, 446, 2}, {459, 230, 0}, {478, 379, 0}, {497, 356, 0}, {388, 128, 0}, {323, 352, 0}, {247, 64, 21}, {316, 242, 0}, {130, 251, 3}, {226, 370, 2}, {476, 332, 0}, {358, 151, 0}, {262, 218, 16}, {303, 214, 0}, {139, 201, 3}, {87, 285, 3}, {502, 306, 0}, {281, 7, 22}, {332, 501, 2}, {56, 152, 7}, {475, 386, 0}, {234, 425, 17}, {279, 21, 22}, {456, 231, 0}, {122, 3, 21}, {503, 131, 0}, {52, 307, 6}, {198, 196, 3}, {302, 38, 21}, {284, 126, 22}, {418, 386, 0}, {39, 109, 7}, {400, 438, 0}, {456, 438, 0}, {412, 430, 0}, {399, 143, 0}, {132, 289, 3}, {456, 449, 0}, {243, 292, 3}, {309, 338, 0}, {61, 282, 3}, {341, 292, 0}, {366, 225, 0}, {186, 27, 21}, {233, 482, 17}, {250, 287, 3}, {326, 45, 21}, {220, 251, 3}, {213, 113, 21}, {482, 220, 0}, {261, 116, 22}, {214, 141, 22}, {146, 477, 17}, {198, 118, 21}, {397, 54, 0}, {338, 130, 0}, {368, 374, 0}, {67, 67, 16}, {466, 274, 0}, {338, 34, 21}, {240, 71, 21}, {203, 334, 17}, {254, 465, 2}, {35, 128, 6}, {70, 246, 20}, {107, 284, 3}, {20, 370, 2}, {421, 97, 0}, {469, 331, 0}, {455, 96, 0}, {2, 335, 6}, {88, 360, 17}, {468, 255, 0}, {332, 154, 7}, {499, 166, 0}, {164, 365, 2},};
    public int[][] base = {{171, 497, 0}, {69, 130, 1}, {412, 107, 1}, {35, 168, 1}, {233, 337, 0}, {510, 409, 1}, {92, 263, 0}, {223, 262, 0}, {201, 226, 0}, {54, 44, 0}, {221, 439, 0}, {234, 47, 0}, {392, 313, 1}, {506, 263, 0}, {53, 351, 0}, {269, 216, 0}, {71, 494, 0}, {44, 291, 0}, {451, 285, 0}, {457, 131, 0}, {241, 52, 0}, {326, 300, 0}, {163, 334, 0}, {86, 284, 0}, {407, 218, 0}, {121, 398, 0}, {158, 273, 0}, {213, 81, 0}, {76, 431, 0}, {76, 220, 1}, {164, 252, 0}, {342, 426, 0}, {342, 307, 0}, {446, 426, 0}, {411, 428, 0}, {379, 436, 0}, {488, 116, 0}, {278, 201, 1}, {157, 355, 0}, {199, 377, 0}, {30, 37, 0}, {15, 325, 0}, {295, 498, 0}, {332, 477, 1}, {493, 256, 0}, {203, 121, 0}, {158, 272, 0}, {93, 150, 0}, {479, 229, 1}, {287, 9, 0}, {151, 297, 0}, {50, 491, 0}, {3, 308, 1}, {304, 461, 0}, {202, 470, 0}, {234, 397, 1}, {334, 115, 1}, {15, 47, 1}, {91, 311, 0}, {92, 420, 0}, {460, 120, 0}, {14, 232, 0}, {44, 164, 0}, {309, 315, 0}, {121, 503, 0}, {505, 430, 0}, {324, 345, 0}, {135, 320, 0}, {109, 444, 0}, {204, 202, 0}, {267, 278, 0}, {401, 125, 0}, {507, 369, 14}, {214, 120, 0}, {297, 274, 1}, {499, 504, 0}, {504, 373, 0}, {286, 364, 0}, {0, 229, 0}, {149, 429, 0}, {232, 272, 0}, {209, 207, 0}, {382, 458, 0}, {429, 395, 10}, {506, 500, 0}, {41, 188, 0}, {472, 477, 12}, {9, 95, 0}, {501, 483, 0}, {168, 336, 0}, {270, 480, 0}, {369, 365, 0}, {253, 318, 0}, {486, 53, 1}, {151, 372, 0}, {364, 75, 0}, {232, 293, 1}, {48, 186, 0}, {134, 177, 0}, {220, 208, 0}, {329, 462, 1}, {303, 384, 0}, {145, 426, 0}, {32, 225, 0}, {468, 505, 0}, {152, 20, 0}, {501, 344, 0}, {37, 314, 1}, {421, 73, 0}, {321, 218, 0}, {251, 335, 0}, {417, 366, 1}, {58, 447, 0}, {139, 41, 0}, {494, 160, 0}, {30, 471, 0}, {363, 172, 0}, {24, 149, 0}, {489, 84, 0}, {219, 76, 0}, {130, 469, 0}, {187, 10, 0}, {372, 258, 0}, {431, 64, 0}, {441, 496, 0}, {381, 408, 0}, {23, 329, 1}, {507, 6, 0}, {237, 511, 0}, {1, 148, 0}, {93, 8, 0}, {395, 482, 0}, {509, 426, 12}, {283, 273, 1}, {364, 424, 0}, {210, 493, 0}, {380, 316, 0}, {161, 401, 0}, {88, 264, 0}, {340, 437, 0}, {185, 416, 1}, {121, 77, 0}, {426, 276, 0}, {49, 10, 1}, {216, 327, 0}, {212, 394, 1}, {306, 399, 12}, {493, 133, 0}, {442, 485, 0}, {48, 486, 0}, {286, 34, 1}, {313, 220, 0}, {206, 386, 1}, {289, 472, 0}, {411, 87, 1}, {308, 103, 10}, {400, 111, 1}, {65, 57, 12}, {470, 480, 10}, {40, 473, 0}, {344, 155, 0}, {443, 263, 0}, {510, 62, 0}, {466, 161, 0}, {146, 433, 0}, {465, 351, 0}, {49, 428, 0}, {140, 40, 0}, {462, 159, 0}, {100, 29, 0}, {423, 269, 0}, {113, 429, 0}, {62, 52, 0}, {316, 386, 0}, {66, 391, 0}, {346, 371, 0}, {63, 442, 0}, {247, 467, 0}, {215, 121, 0}, {511, 387, 0}, {46, 446, 1}, {459, 230, 0}, {478, 379, 0}, {497, 356, 0}, {388, 128, 0}, {323, 352, 0}, {247, 64, 0}, {316, 242, 0}, {130, 251, 0}, {226, 370, 1}, {476, 332, 0}, {358, 151, 1}, {262, 218, 0}, {303, 214, 0}, {139, 201, 1}, {87, 285, 0}, {502, 306, 0}, {281, 7, 1}, {332, 501, 0}, {56, 152, 0}, {475, 386, 0}, {234, 425, 0}, {279, 21, 1}, {456, 231, 0}, {122, 3, 1}, {503, 131, 0}, {52, 307, 0}, {198, 196, 0}, {302, 38, 1}, {284, 126, 12}, {418, 386, 1}, {39, 109, 0}, {400, 438, 0}, {456, 438, 1}, {412, 430, 0}, {399, 143, 0}, {132, 289, 0}, {456, 449, 1}, {243, 292, 0}, {309, 338, 0}, {61, 282, 0}, {341, 292, 0}, {366, 225, 0}, {186, 27, 0}, {233, 482, 0}, {250, 287, 0}, {326, 45, 1}, {220, 251, 0}, {213, 113, 0}, {482, 220, 0}, {261, 116, 0}, {214, 141, 1}, {146, 477, 0}, {198, 118, 0}, {397, 54, 0}, {338, 130, 1}, {368, 374, 0}, {67, 67, 0}, {466, 274, 0}, {338, 34, 1}, {240, 71, 0}, {203, 334, 0}, {254, 465, 0}, {35, 128, 0}, {70, 246, 0}, {107, 284, 0}, {20, 370, 0}, {421, 97, 0}, {469, 331, 0}, {455, 96, 1}, {2, 335, 0}, {88, 360, 1}, {468, 255, 1}, {332, 154, 0}, {499, 166, 0}, {164, 365, 1},};
    public int[][] noise = {{171, 497, 0}, {69, 130, 3}, {412, 107, 2}, {35, 168, 3}, {233, 337, 0}, {510, 409, 2}, {92, 263, 0}, {223, 262, 0}, {201, 226, 0}, {54, 44, 0}, {221, 439, 0}, {234, 47, 0}, {392, 313, 3}, {506, 263, 0}, {53, 351, 0}, {269, 216, 0}, {71, 494, 0}, {44, 291, 0}, {451, 285, 0}, {457, 131, 0}, {241, 52, 0}, {326, 300, 0}, {163, 334, 0}, {86, 284, 0}, {407, 218, 0}, {121, 398, 0}, {158, 273, 0}, {213, 81, 0}, {76, 431, 0}, {76, 220, 3}, {164, 252, 0}, {342, 426, 0}, {342, 307, 0}, {446, 426, 0}, {411, 428, 0}, {379, 436, 0}, {488, 116, 0}, {278, 201, 2}, {157, 355, 0}, {199, 377, 0}, {30, 37, 0}, {15, 325, 0}, {295, 498, 0}, {332, 477, 2}, {493, 256, 0}, {203, 121, 0}, {158, 272, 0}, {93, 150, 0}, {479, 229, 3}, {287, 9, 0}, {151, 297, 0}, {50, 491, 0}, {3, 308, 3}, {304, 461, 0}, {202, 470, 0}, {234, 397, 2}, {334, 115, 2}, {15, 47, 2}, {91, 311, 0}, {92, 420, 0}, {460, 120, 0}, {14, 232, 0}, {44, 164, 0}, {309, 315, 0}, {121, 503, 0}, {505, 430, 0}, {324, 345, 0}, {135, 320, 0}, {109, 444, 0}, {204, 202, 0}, {267, 278, 0}, {401, 125, 0}, {507, 369, 3}, {214, 120, 0}, {297, 274, 3}, {499, 504, 0}, {504, 373, 0}, {286, 364, 0}, {0, 229, 0}, {149, 429, 0}, {232, 272, 0}, {209, 207, 0}, {382, 458, 0}, {429, 395, 2}, {506, 500, 0}, {41, 188, 0}, {472, 477, 3}, {9, 95, 0}, {501, 483, 0}, {168, 336, 0}, {270, 480, 0}, {369, 365, 0}, {253, 318, 0}, {486, 53, 3}, {151, 372, 0}, {364, 75, 0}, {232, 293, 2}, {48, 186, 0}, {134, 177, 0}, {220, 208, 0}, {329, 462, 3}, {303, 384, 0}, {145, 426, 0}, {32, 225, 0}, {468, 505, 0}, {152, 20, 0}, {501, 344, 0}, {37, 314, 2}, {421, 73, 0}, {321, 218, 0}, {251, 335, 0}, {417, 366, 3}, {58, 447, 0}, {139, 41, 0}, {494, 160, 0}, {30, 471, 0}, {363, 172, 0}, {24, 149, 0}, {489, 84, 0}, {219, 76, 0}, {130, 469, 0}, {187, 10, 0}, {372, 258, 0}, {431, 64, 0}, {441, 496, 0}, {381, 408, 0}, {23, 329, 3}, {507, 6, 0}, {237, 511, 0}, {1, 148, 0}, {93, 8, 0}, {395, 482, 0}, {509, 426, 3}, {283, 273, 3}, {364, 424, 0}, {210, 493, 0}, {380, 316, 0}, {161, 401, 0}, {88, 264, 0}, {340, 437, 0}, {185, 416, 2}, {121, 77, 0}, {426, 276, 0}, {49, 10, 2}, {216, 327, 0}, {212, 394, 3}, {306, 399, 3}, {493, 133, 0}, {442, 485, 0}, {48, 486, 0}, {286, 34, 2}, {313, 220, 0}, {206, 386, 2}, {289, 472, 0}, {411, 87, 2}, {308, 103, 2}, {400, 111, 3}, {65, 57, 3}, {470, 480, 3}, {40, 473, 0}, {344, 155, 0}, {443, 263, 0}, {510, 62, 0}, {466, 161, 0}, {146, 433, 0}, {465, 351, 0}, {49, 428, 0}, {140, 40, 0}, {462, 159, 0}, {100, 29, 0}, {423, 269, 0}, {113, 429, 0}, {62, 52, 0}, {316, 386, 0}, {66, 391, 0}, {346, 371, 0}, {63, 442, 0}, {247, 467, 0}, {215, 121, 0}, {511, 387, 0}, {46, 446, 2}, {459, 230, 0}, {478, 379, 0}, {497, 356, 0}, {388, 128, 0}, {323, 352, 0}, {247, 64, 0}, {316, 242, 0}, {130, 251, 0}, {226, 370, 3}, {476, 332, 0}, {358, 151, 2}, {262, 218, 0}, {303, 214, 0}, {139, 201, 2}, {87, 285, 0}, {502, 306, 0}, {281, 7, 3}, {332, 501, 0}, {56, 152, 0}, {475, 386, 0}, {234, 425, 0}, {279, 21, 2}, {456, 231, 0}, {122, 3, 3}, {503, 131, 0}, {52, 307, 0}, {198, 196, 0}, {302, 38, 3}, {284, 126, 3}, {418, 386, 3}, {39, 109, 0}, {400, 438, 0}, {456, 438, 3}, {412, 430, 0}, {399, 143, 0}, {132, 289, 0}, {456, 449, 3}, {243, 292, 0}, {309, 338, 0}, {61, 282, 0}, {341, 292, 0}, {366, 225, 0}, {186, 27, 0}, {233, 482, 0}, {250, 287, 0}, {326, 45, 3}, {220, 251, 0}, {213, 113, 0}, {482, 220, 0}, {261, 116, 0}, {214, 141, 3}, {146, 477, 0}, {198, 118, 0}, {397, 54, 0}, {338, 130, 2}, {368, 374, 0}, {67, 67, 0}, {466, 274, 0}, {338, 34, 2}, {240, 71, 0}, {203, 334, 0}, {254, 465, 0}, {35, 128, 0}, {70, 246, 0}, {107, 284, 0}, {20, 370, 0}, {421, 97, 0}, {469, 331, 0}, {455, 96, 2}, {2, 335, 0}, {88, 360, 3}, {468, 255, 3}, {332, 154, 0}, {499, 166, 0}, {164, 365, 3},};
    public int[][] river = {{171, 497, -1}, {69, 130, -1}, {412, 107, -1}, {35, 168, -1}, {233, 337, -1}, {510, 409, 7}, {92, 263, -1}, {223, 262, -1}, {201, 226, -1}, {54, 44, -1}, {221, 439, -1}, {234, 47, -1}, {392, 313, -1}, {506, 263, -1}, {53, 351, -1}, {269, 216, -1}, {71, 494, 7}, {44, 291, -1}, {451, 285, 7}, {457, 131, 7}, {241, 52, -1}, {326, 300, -1}, {163, 334, -1}, {86, 284, -1}, {407, 218, -1}, {121, 398, -1}, {158, 273, -1}, {213, 81, 7}, {76, 431, -1}, {76, 220, -1}, {164, 252, -1}, {342, 426, -1}, {342, 307, -1}, {446, 426, -1}, {411, 428, -1}, {379, 436, -1}, {488, 116, 7}, {278, 201, -1}, {157, 355, -1}, {199, 377, -1}, {30, 37, -1}, {15, 325, -1}, {295, 498, -1}, {332, 477, -1}, {493, 256, -1}, {203, 121, 7}, {158, 272, -1}, {93, 150, -1}, {479, 229, -1}, {287, 9, -1}, {151, 297, -1}, {50, 491, 7}, {3, 308, -1}, {304, 461, -1}, {202, 470, -1}, {234, 397, -1}, {334, 115, -1}, {15, 47, -1}, {91, 311, -1}, {92, 420, -1}, {460, 120, 7}, {14, 232, -1}, {44, 164, -1}, {309, 315, -1}, {121, 503, -1}, {505, 430, 7}, {324, 345, -1}, {135, 320, -1}, {109, 444, -1}, {204, 202, -1}, {267, 278, -1}, {401, 125, -1}, {507, 369, 7}, {214, 120, 7}, {297, 274, -1}, {499, 504, -1}, {504, 373, 7}, {286, 364, -1}, {0, 229, -1}, {149, 429, -1}, {232, 272, -1}, {209, 207, -1}, {382, 458, -1}, {429, 395, 7}, {506, 500, -1}, {41, 188, -1}, {472, 477, -1}, {9, 95, -1}, {501, 483, 7}, {168, 336, -1}, {270, 480, -1}, {369, 365, -1}, {253, 318, -1}, {486, 53, 7}, {151, 372, -1}, {364, 75, 7}, {232, 293, -1}, {48, 186, -1}, {134, 177, -1}, {220, 208, -1}, {329, 462, -1}, {303, 384, -1}, {145, 426, -1}, {32, 225, -1}, {468, 505, -1}, {152, 20, 7}, {501, 344, -1}, {37, 314, -1}, {421, 73, -1}, {321, 218, -1}, {251, 335, -1}, {417, 366, -1}, {58, 447, -1}, {139, 41, 7}, {494, 160, 7}, {30, 471, -1}, {363, 172, -1}, {24, 149, -1}, {489, 84, 7}, {219, 76, -1}, {130, 469, -1}, {187, 10, 7}, {372, 258, -1}, {431, 64, -1}, {441, 496, -1}, {381, 408, -1}, {23, 329, -1}, {507, 6, 7}, {237, 511, -1}, {1, 148, -1}, {93, 8, 7}, {395, 482, -1}, {509, 426, 7}, {283, 273, -1}, {364, 424, -1}, {210, 493, -1}, {380, 316, -1}, {161, 401, -1}, {88, 264, -1}, {340, 437, -1}, {185, 416, -1}, {121, 77, 7}, {426, 276, -1}, {49, 10, -1}, {216, 327, -1}, {212, 394, -1}, {306, 399, -1}, {493, 133, 7}, {442, 485, -1}, {48, 486, 7}, {286, 34, -1}, {313, 220, -1}, {206, 386, -1}, {289, 472, -1}, {411, 87, -1}, {308, 103, -1}, {400, 111, -1}, {65, 57, 7}, {470, 480, -1}, {40, 473, -1}, {344, 155, -1}, {443, 263, -1}, {510, 62, 7}, {466, 161, 7}, {146, 433, -1}, {465, 351, -1}, {49, 428, -1}, {140, 40, 7}, {462, 159, 7}, {100, 29, 7}, {423, 269, -1}, {113, 429, -1}, {62, 52, -1}, {316, 386, -1}, {66, 391, -1}, {346, 371, -1}, {63, 442, -1}, {247, 467, -1}, {215, 121, 7}, {511, 387, 7}, {46, 446, -1}, {459, 230, -1}, {478, 379, -1}, {497, 356, -1}, {388, 128, -1}, {323, 352, -1}, {247, 64, -1}, {316, 242, -1}, {130, 251, -1}, {226, 370, -1}, {476, 332, 7}, {358, 151, -1}, {262, 218, -1}, {303, 214, -1}, {139, 201, -1}, {87, 285, -1}, {502, 306, -1}, {281, 7, -1}, {332, 501, -1}, {56, 152, -1}, {475, 386, -1}, {234, 425, -1}, {279, 21, -1}, {456, 231, -1}, {122, 3, 7}, {503, 131, 7}, {52, 307, -1}, {198, 196, -1}, {302, 38, -1}, {284, 126, -1}, {418, 386, 7}, {39, 109, -1}, {400, 438, -1}, {456, 438, -1}, {412, 430, -1}, {399, 143, -1}, {132, 289, -1}, {456, 449, -1}, {243, 292, 7}, {309, 338, -1}, {61, 282, -1}, {341, 292, -1}, {366, 225, 7}, {186, 27, 7}, {233, 482, -1}, {250, 287, 7}, {326, 45, -1}, {220, 251, -1}, {213, 113, 7}, {482, 220, -1}, {261, 116, 7}, {214, 141, -1}, {146, 477, -1}, {198, 118, 7}, {397, 54, 7}, {338, 130, -1}, {368, 374, -1}, {67, 67, 7}, {466, 274, -1}, {338, 34, -1}, {240, 71, -1}, {203, 334, -1}, {254, 465, -1}, {35, 128, -1}, {70, 246, -1}, {107, 284, -1}, {20, 370, -1}, {421, 97, -1}, {469, 331, 7}, {455, 96, 7}, {2, 335, -1}, {88, 360, -1}, {468, 255, -1}, {332, 154, -1}, {499, 166, 7}, {164, 365, 7},};
    public int[][] variants = {{171, 497, 21}, {69, 130, 2}, {412, 107, 0}, {35, 168, 2}, {233, 337, 21}, {510, 409, 0}, {92, 263, 2}, {223, 262, 22}, {201, 226, 21}, {54, 44, 7}, {221, 439, 21}, {234, 47, 16}, {392, 313, 1}, {506, 263, 6}, {53, 351, 1}, {269, 216, 5}, {71, 494, 0}, {44, 291, 6}, {451, 285, 0}, {457, 131, 0}, {241, 52, 4}, {326, 300, 6}, {163, 334, 22}, {86, 284, 2}, {407, 218, 0}, {121, 398, 5}, {158, 273, 21}, {213, 81, 16}, {76, 431, 5}, {76, 220, 6}, {164, 252, 7}, {342, 426, 7}, {342, 307, 7}, {446, 426, 2}, {411, 428, 21}, {379, 436, 6}, {488, 116, 0}, {278, 201, 5}, {157, 355, 21}, {199, 377, 22}, {30, 37, 3}, {15, 325, 4}, {295, 498, 6}, {332, 477, 6}, {493, 256, 2}, {203, 121, 0}, {158, 272, 21}, {93, 150, 16}, {479, 229, 6}, {287, 9, 2}, {151, 297, 7}, {50, 491, 0}, {3, 308, 5}, {304, 461, 21}, {202, 470, 21}, {234, 397, 2}, {334, 115, 4}, {15, 47, 6}, {91, 311, 2}, {92, 420, 5}, {460, 120, 0}, {14, 232, 2}, {44, 164, 2}, {309, 315, 1}, {121, 503, 21}, {505, 430, 0}, {324, 345, 6}, {135, 320, 2}, {109, 444, 5}, {204, 202, 6}, {267, 278, 1}, {401, 125, 1}, {507, 369, 0}, {214, 120, 1}, {297, 274, 21}, {499, 504, 1}, {504, 373, 0}, {286, 364, 21}, {0, 229, 5}, {149, 429, 3}, {232, 272, 22}, {209, 207, 6}, {382, 458, 6}, {429, 395, 21}, {506, 500, 1}, {41, 188, 6}, {472, 477, 1}, {9, 95, 17}, {501, 483, 0}, {168, 336, 22}, {270, 480, 5}, {369, 365, 20}, {253, 318, 1}, {486, 53, 0}, {151, 372, 5}, {364, 75, 0}, {232, 293, 21}, {48, 186, 6}, {134, 177, 18}, {220, 208, 7}, {329, 462, 21}, {303, 384, 21}, {145, 426, 3}, {32, 225, 2}, {468, 505, 1}, {152, 20, 0}, {501, 344, 6}, {37, 314, 1}, {421, 73, 0}, {321, 218, 18}, {251, 335, 1}, {417, 366, 21}, {58, 447, 19}, {139, 41, 0}, {494, 160, 0}, {30, 471, 5}, {363, 172, 16}, {24, 149, 2}, {489, 84, 0}, {219, 76, 4}, {130, 469, 3}, {187, 10, 0}, {372, 258, 21}, {431, 64, 16}, {441, 496, 1}, {381, 408, 3}, {23, 329, 1}, {507, 6, 0}, {237, 511, 5}, {1, 148, 1}, {93, 8, 21}, {395, 482, 6}, {509, 426, 0}, {283, 273, 21}, {364, 424, 21}, {210, 493, 6}, {380, 316, 1}, {161, 401, 5}, {88, 264, 2}, {340, 437, 21}, {185, 416, 22}, {121, 77, 0}, {426, 276, 2}, {49, 10, 21}, {216, 327, 21}, {212, 394, 21}, {306, 399, 22}, {493, 133, 0}, {442, 485, 1}, {48, 486, 0}, {286, 34, 6}, {313, 220, 4}, {206, 386, 21}, {289, 472, 6}, {411, 87, 0}, {308, 103, 4}, {400, 111, 16}, {65, 57, 0}, {470, 480, 1}, {40, 473, 0}, {344, 155, 4}, {443, 263, 17}, {510, 62, 0}, {466, 161, 16}, {146, 433, 3}, {465, 351, 16}, {49, 428, 5}, {140, 40, 0}, {462, 159, 16}, {100, 29, 0}, {423, 269, 2}, {113, 429, 20}, {62, 52, 20}, {316, 386, 21}, {66, 391, 1}, {346, 371, 21}, {63, 442, 19}, {247, 467, 7}, {215, 121, 1}, {511, 387, 0}, {46, 446, 19}, {459, 230, 2}, {478, 379, 0}, {497, 356, 6}, {388, 128, 1}, {323, 352, 7}, {247, 64, 4}, {316, 242, 21}, {130, 251, 5}, {226, 370, 21}, {476, 332, 0}, {358, 151, 16}, {262, 218, 5}, {303, 214, 4}, {139, 201, 4}, {87, 285, 2}, {502, 306, 6}, {281, 7, 2}, {332, 501, 6}, {56, 152, 2}, {475, 386, 21}, {234, 425, 21}, {279, 21, 2}, {456, 231, 2}, {122, 3, 0}, {503, 131, 0}, {52, 307, 6}, {198, 196, 6}, {302, 38, 6}, {284, 126, 1}, {418, 386, 21}, {39, 109, 17}, {400, 438, 6}, {456, 438, 2}, {412, 430, 21}, {399, 143, 4}, {132, 289, 21}, {456, 449, 16}, {243, 292, 1}, {309, 338, 6}, {61, 282, 2}, {341, 292, 21}, {366, 225, 0}, {186, 27, 0}, {233, 482, 6}, {250, 287, 1}, {326, 45, 6}, {220, 251, 21}, {213, 113, 0}, {482, 220, 6}, {261, 116, 4}, {214, 141, 16}, {146, 477, 3}, {198, 118, 0}, {397, 54, 0}, {338, 130, 1}, {368, 374, 3}, {67, 67, 20}, {466, 274, 2}, {338, 34, 6}, {240, 71, 4}, {203, 334, 22}, {254, 465, 7}, {35, 128, 2}, {70, 246, 2}, {107, 284, 2}, {20, 370, 1}, {421, 97, 16}, {469, 331, 0}, {455, 96, 0}, {2, 335, 1}, {88, 360, 1}, {468, 255, 2}, {332, 154, 4}, {499, 166, 0}, {164, 365, 5},};
    public int[][] biomes = {{171, 497, 0}, {69, 130, 0}, {412, 107, 0}, {35, 168, 3}, {233, 337, 0}, {510, 409, 0}, {92, 263, 4}, {223, 262, 0}, {201, 226, 0}, {54, 44, 0}, {221, 439, 0}, {234, 47, 2}, {392, 313, 2}, {506, 263, 0}, {53, 351, 0}, {269, 216, 12}, {71, 494, 0}, {44, 291, 3}, {451, 285, 0}, {457, 131, 0}, {241, 52, 1}, {326, 300, 4}, {163, 334, 0}, {86, 284, 0}, {407, 218, 0}, {121, 398, 0}, {158, 273, 0}, {213, 81, 6}, {76, 431, 0}, {76, 220, 0}, {164, 252, 0}, {342, 426, 12}, {342, 307, 0}, {446, 426, 21}, {411, 428, 21}, {379, 436, 1}, {488, 116, 0}, {278, 201, 12}, {157, 355, 0}, {199, 377, 0}, {30, 37, 1}, {15, 325, 0}, {295, 498, 0}, {332, 477, 0}, {493, 256, 0}, {203, 121, 1}, {158, 272, 0}, {93, 150, 0}, {479, 229, 0}, {287, 9, 0}, {151, 297, 0}, {50, 491, 0}, {3, 308, 1}, {304, 461, 4}, {202, 470, 0}, {234, 397, 0}, {334, 115, 0}, {15, 47, 0}, {91, 311, 0}, {92, 420, 0}, {460, 120, 0}, {14, 232, 4}, {44, 164, 1}, {309, 315, 0}, {121, 503, 0}, {505, 430, 0}, {324, 345, 0}, {135, 320, 0}, {109, 444, 0}, {204, 202, 0}, {267, 278, 0}, {401, 125, 0}, {507, 369, 0}, {214, 120, 3}, {297, 274, 2}, {499, 504, 0}, {504, 373, 0}, {286, 364, 0}, {0, 229, 3}, {149, 429, 0}, {232, 272, 0}, {209, 207, 0}, {382, 458, 0}, {429, 395, 6}, {506, 500, 0}, {41, 188, 6}, {472, 477, 0}, {9, 95, 0}, {501, 483, 0}, {168, 336, 0}, {270, 480, 0}, {369, 365, 0}, {253, 318, 0}, {486, 53, 12}, {151, 372, 0}, {364, 75, 0}, {232, 293, 0}, {48, 186, 6}, {134, 177, 0}, {220, 208, 0}, {329, 462, 0}, {303, 384, 0}, {145, 426, 0}, {32, 225, 3}, {468, 505, 0}, {152, 20, 0}, {501, 344, 0}, {37, 314, 0}, {421, 73, 0}, {321, 218, 21}, {251, 335, 0}, {417, 366, 0}, {58, 447, 0}, {139, 41, 0}, {494, 160, 0}, {30, 471, 0}, {363, 172, 0}, {24, 149, 0}, {489, 84, 0}, {219, 76, 5}, {130, 469, 0}, {187, 10, 0}, {372, 258, 5}, {431, 64, 0}, {441, 496, 0}, {381, 408, 3}, {23, 329, 0}, {507, 6, 3}, {237, 511, 0}, {1, 148, 21}, {93, 8, 0}, {395, 482, 0}, {509, 426, 0}, {283, 273, 5}, {364, 424, 2}, {210, 493, 0}, {380, 316, 21}, {161, 401, 0}, {88, 264, 2}, {340, 437, 5}, {185, 416, 12}, {121, 77, 0}, {426, 276, 0}, {49, 10, 0}, {216, 327, 0}, {212, 394, 0}, {306, 399, 0}, {493, 133, 0}, {442, 485, 0}, {48, 486, 0}, {286, 34, 1}, {313, 220, 1}, {206, 386, 0}, {289, 472, 6}, {411, 87, 0}, {308, 103, 5}, {400, 111, 0}, {65, 57, 0}, {470, 480, 0}, {40, 473, 0}, {344, 155, 0}, {443, 263, 0}, {510, 62, 0}, {466, 161, 0}, {146, 433, 0}, {465, 351, 0}, {49, 428, 0}, {140, 40, 0}, {462, 159, 0}, {100, 29, 0}, {423, 269, 0}, {113, 429, 0}, {62, 52, 0}, {316, 386, 0}, {66, 391, 0}, {346, 371, 0}, {63, 442, 0}, {247, 467, 0}, {215, 121, 3}, {511, 387, 0}, {46, 446, 0}, {459, 230, 0}, {478, 379, 0}, {497, 356, 0}, {388, 128, 0}, {323, 352, 0}, {247, 64, 0}, {316, 242, 12}, {130, 251, 0}, {226, 370, 12}, {476, 332, 0}, {358, 151, 0}, {262, 218, 12}, {303, 214, 0}, {139, 201, 0}, {87, 285, 0}, {502, 306, 0}, {281, 7, 0}, {332, 501, 0}, {56, 152, 5}, {475, 386, 0}, {234, 425, 0}, {279, 21, 5}, {456, 231, 0}, {122, 3, 0}, {503, 131, 0}, {52, 307, 0}, {198, 196, 0}, {302, 38, 0}, {284, 126, 2}, {418, 386, 0}, {39, 109, 0}, {400, 438, 0}, {456, 438, 1}, {412, 430, 0}, {399, 143, 0}, {132, 289, 0}, {456, 449, 2}, {243, 292, 0}, {309, 338, 0}, {61, 282, 0}, {341, 292, 0}, {366, 225, 4}, {186, 27, 0}, {233, 482, 0}, {250, 287, 0}, {326, 45, 0}, {220, 251, 0}, {213, 113, 1}, {482, 220, 0}, {261, 116, 5}, {214, 141, 3}, {146, 477, 0}, {198, 118, 2}, {397, 54, 0}, {338, 130, 0}, {368, 374, 0}, {67, 67, 0}, {466, 274, 0}, {338, 34, 0}, {240, 71, 3}, {203, 334, 0}, {254, 465, 0}, {35, 128, 0}, {70, 246, 0}, {107, 284, 0}, {20, 370, 0}, {421, 97, 0}, {469, 331, 0}, {455, 96, 0}, {2, 335, 0}, {88, 360, 0}, {468, 255, 0}, {332, 154, 0}, {499, 166, 0}, {164, 365, 0},};

    private OverworldBiomeSource overworldBiomeSource;
    private int size;
    private static final String version = "1.4.7";

    @BeforeEach
    public void setup() {
        this.overworldBiomeSource = new OverworldBiomeSource(MCVersion.v1_4_7, 489435348641386L);
        this.size = 16;
    }

    @Test
    @DisplayName("Test Biomes against data for " + version)
    public void testBiomes() {
        randomBiomeGen(size, overworldBiomeSource.biomes, biomes);
    }

    @Test
    @DisplayName("Test Noise against data for " + version)
    public void testNoise() {
        // this can not be tested as there is no existence of a noise + 2 scaled in that version (due to no hills, inserting a debug is the only possibility)
        // randomBiomeGen(size, overworldBiomeSource.debug, noise);
        assertTrue(true);
    }

    @Test
    @DisplayName("Test full mixing river with biomes against data for " + version)
    public void testFull() {
        randomBiomeGen(size, overworldBiomeSource.full, full);
    }

    @Test
    @DisplayName("Test voronoi against data for " + version)
    public void testVoronoi() {
        randomBiomeGen(size, overworldBiomeSource.voronoi, voronoi);
    }

    @Test
    @DisplayName("Test river against data for " + version)
    public void testRiver() {
        randomBiomeGen(size, overworldBiomeSource.river, river);
    }

    @Test
    @DisplayName("Test Variants against data for " + version)
    public void testVariants() {
        //singleBlockBiomeGen(overworldBiomeSource.debug,92 ,263 ,4);
        randomBiomeGen(size, overworldBiomeSource.variants, variants);
    }

    @Test
    @DisplayName("Test First stack against data for " + version)
    public void testBase() {
        randomBiomeGen(size, overworldBiomeSource.base, base);
    }
}


