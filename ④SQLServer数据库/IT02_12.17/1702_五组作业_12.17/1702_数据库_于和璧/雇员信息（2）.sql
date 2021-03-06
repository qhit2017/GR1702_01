USE [db_employeel]
GO
/****** Object:  Table [dbo].[tb_employeel]    Script Date: 12/15/2017 12:00:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employeel](
	[id] [tinyint] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
	[register] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remark] [ntext] NOT NULL,
 CONSTRAINT [PK_tb_employeel] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
